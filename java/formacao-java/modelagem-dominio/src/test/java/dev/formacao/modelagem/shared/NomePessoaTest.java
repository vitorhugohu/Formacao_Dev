package dev.formacao.modelagem.shared;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NomePessoaTest {
    
    @Test
    void deveLancarExcecoesQuandoNomeForNulo() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa(null));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_VAZIO));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_SEM_SOBRENOME));
    }

    @Test
    void deveLancarExcecoesQuandoNomeForVazio() {
        var ex2 = assertThrows(IllegalArgumentException.class, () -> new NomePessoa(""));
        assertTrue(ex2.getMessage().contains(NomePessoa.NOME_VAZIO));
        assertTrue(ex2.getMessage().contains(NomePessoa.NOME_SEM_SOBRENOME));

        var ex3 = assertThrows(IllegalArgumentException.class, () -> new NomePessoa(" "));
        assertTrue(ex3.getMessage().contains(NomePessoa.NOME_VAZIO));
        assertTrue(ex3.getMessage().contains(NomePessoa.NOME_SEM_SOBRENOME));
    }

    @Test
    void deveLancarExcecaoQuandoNomeForPequeno() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa("A B"));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_PEQUENO));
    }

    @Test
    void deveLancarExcecaoQuandoNomeForGrande() {
        String nomeGrande = "A".repeat(122) + " Silva";
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa(nomeGrande));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_GRANDE));
    }

    @Test
    void deveLancarExcecaoQuandoNomeNaoTiverSobrenome() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa("Leonardo"));
        assertEquals(NomePessoa.NOME_SEM_SOBRENOME, ex.getMessage());
    }

    @Test
    void deveLancarExcecaoQuandoNomeTiverCaracteresInvalidos() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa("João Silva 123"));
        assertEquals(NomePessoa.NOME_CARACTERES_INVALIDOS, ex.getMessage());
    }

    @Test
    void deveNormalizarEspacosQuandoNomeForValido() {
        NomePessoa nome = new NomePessoa("  João  da  Silva  ");
        assertEquals("João da Silva", nome.completo());
    }

    @Test
    void deveRetornarPropriedadesBasicasQuandoNomeForValido() {
        NomePessoa nome = new NomePessoa(" João da Silva ");

        assertEquals("João da Silva", nome.completo());
        assertEquals("João", nome.valor());
        assertArrayEquals(new String[] { "da", "Silva" }, nome.sobrenomes());
        assertEquals("Silva", nome.ultimoSobrenome());
    }

    @Test
    void deveRetornarIniciaisQuandoNomeForValido() {
        NomePessoa nome = new NomePessoa("João da Silva");
        assertEquals("JS", nome.iniciais());
    }

    @Test
    void deveRetornarIniciaisQuandoTiverVariosSobrenomes() {
        NomePessoa nome = new NomePessoa("Ana Maria Clara Souza");
        assertEquals("AS", nome.iniciais());
    }

    @Test
    void deveRetornarIniciaisEmMaiusculasQuandoNomeEstiverEmMinusculas() {
        NomePessoa nome = new NomePessoa("joão da silva");
        assertEquals("JS", nome.iniciais());
    }

    @Test
    void deveRetornarIniciaisQuandoNomeTiverAcentos() {
        NomePessoa nome = new NomePessoa("Érico da Silvaa");
        assertEquals("ÉS", nome.iniciais());
    }

    @Test
    void deveRetornarIniciaisQuandoNomeTiverApostrofoOuHifen() {
        NomePessoa nome = new NomePessoa("D'ávila dos Santos-Silva");
        assertEquals("DS", nome.iniciais());
    }

    @Test
    void deveLancarExcecaoQuandoNomeNaoTiverSobrenomeMesmoComEspacosNormalizados() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa("   Leonardo   "));
        assertEquals(NomePessoa.NOME_SEM_SOBRENOME, ex.getMessage());
    }

    @Test
    void deveCombinarMultiplosErrosQuandoNomeForInvalido() {
        var ex = assertThrows(IllegalArgumentException.class, () -> new NomePessoa("!"));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_PEQUENO));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_SEM_SOBRENOME));
        assertTrue(ex.getMessage().contains(NomePessoa.NOME_CARACTERES_INVALIDOS));
    }
}
