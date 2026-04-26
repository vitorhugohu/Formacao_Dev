package dev.formacao.modelagem.shared;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class IdUuidTest {
    @Test
    void deveLancarErroQuandoValorForNulo() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            new IdUuid(null);
        });
        assertTrue(ex.getMessage().contains(IdUuid.ID_NULO));
    }

    @Test
    void deveLancarErroQuandoValorForVazio() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            new IdUuid("");
        });
        assertTrue(ex.getMessage().contains(IdUuid.ID_VAZIO));
    }

    @Test
    void deveLancarErroQuandoValorForApenasEspacos() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            new IdUuid("   ");
        });
        assertTrue(ex.getMessage().contains(IdUuid.ID_VAZIO));
    }

    @Test
    void deveLancarErroQuandoValorForInvalido() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            new IdUuid("invalid-uuid");
        });
        assertTrue(ex.getMessage().contains(IdUuid.ID_INVALIDO));
    }

    @Test
    void deveManterValorQuandoValorForInformado() {
        IdUuid id = new IdUuid("3d8dc25f-d46a-4b86-85ca-769bce668b85");
        assertEquals("3d8dc25f-d46a-4b86-85ca-769bce668b85", id.valor());
    }

    @Test
    void deveGerarUuidQuandoUsarNovo() {
        IdUuid id = IdUuid.novo();
        assertNotNull(id.valor());
        assertFalse(id.valor().isBlank());
        assertDoesNotThrow(() -> UUID.fromString(id.valor()));
    }

    @Test
    void deveGerarIdsDiferentesQuandoUsarNovo() {
        IdUuid id1 = IdUuid.novo();
        IdUuid id2 = IdUuid.novo();
        assertNotEquals(id1.valor(), id2.valor());
    }
}
