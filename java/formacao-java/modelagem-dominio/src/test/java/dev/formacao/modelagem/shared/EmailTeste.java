package dev.formacao.modelagem.shared;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTeste {
    
    @Test
    void deveLancarExcecaoQuandoEmailForNulo() {
        var ex = assertThrows(IllegalStateException.class, () -> new Email(null));
        assertTrue(ex.getMessage().contains(Email.EMAIL_NULO)); 
        assertTrue(ex.getMessage().contains(Email.EMAIL_VAZIO)); 
    }

    @Test
    void deveLancarExcecaoQuandoEmailForVazio() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertTrue(ex.getMessage().contains(Email.EMAIL_VAZIO));
        assertTrue(ex.getMessage().contains(Email.EMAIL_INVALIDO)); 
    }

    @Test
    void deveLancarExceceaoQuandoForInvalido() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new Email("leo@"));
        assertEquals(Email.EMAIL_INVALIDO, ex.getMessage());
    }

    @Test
    void deveNormalizarEExtrairLocalEDominioQuandoEmailForValido() {
        Email email = new Email("  Vitor.Moreira@Exemplo.COM  ");
        assertEquals("vitor.moreira@exemplo.com", email.valor());
        assertEquals("vitor.moreira", email.local());
        assertEquals("exemplo.com", email.dominio());
    }

    @Test
    void deveAceitarLocalQuandoLocalTiver64Caracteres() {
        String local = "a".repeat(64);
        Email email = new Email(local + "@exemplo.com");
        assertEquals(local, email.local());
        assertEquals("exemplo.com", email.dominio());
    }

    @Test
    void deveLancarExcecaoQuandoLocalTiver65Caracteres() {
        String local = "a".repeat(65);
        var ex = assertThrows(IllegalArgumentException.class, () -> new Email(local + "@exemplo.com"));
        assertTrue(ex.getMessage().contains(Email.EMAIL_LOCAL_GRANDE));
    }

    @Test
    void deveAceitarDominioQuandoTiver255Caracteres() {
        String dominio = "a".repeat(251) + ".com";
        Email email = new Email("leo@" + dominio);
        assertEquals("leo", email.local());
        assertEquals(dominio, email.dominio());
    }

    @Test
    void deveLancarExcecaoQuandoDominioTiver256Caracteres() {
        String dominio = "a".repeat(252) + ".com";
        var ex = assertThrows(IllegalArgumentException.class, () -> new Email("leo@" + dominio));
        assertTrue(ex.getMessage().contains(Email.EMAIL_DOMINIO_GRANDE));
    }

    @Test
    void deveCombinarErrosQuandoLocalEDominioEstouraremLimite() {
        String local = "a".repeat(65);
        String dominio = "a".repeat(252) + ".com";
        var ex = assertThrows(IllegalArgumentException.class, () -> new Email(local + "@" + dominio));
        assertTrue(ex.getMessage().contains(Email.EMAIL_LOCAL_GRANDE));
        assertTrue(ex.getMessage().contains(Email.EMAIL_DOMINIO_GRANDE));
    }
}
