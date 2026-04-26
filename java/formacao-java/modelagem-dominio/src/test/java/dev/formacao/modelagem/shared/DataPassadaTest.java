package dev.formacao.modelagem.shared;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;

import org.junit.jupiter.api.Test;

public class DataPassadaTest {
    @Test
    void deveLancarExcecoesQuandoDataForNulaOuNoFuturo() {
        var ex1 = assertThrows(IllegalArgumentException.class,
            () -> new DataPassada(null));
        assertTrue(ex1.getMessage().contains(DataPassada.DATA_NULA));
        assertTrue(ex1.getMessage().contains(DataPassada.DATA_NO_FUTURO));

        var ex2 = assertThrows(IllegalArgumentException.class,
            () -> new DataPassada(Instant.now().plusSeconds(60)));
        assertEquals(DataPassada.DATA_NO_FUTURO, ex2.getMessage());
    }

    @Test
    void deveAceitarDataNoPassado() {
        Instant passado = Instant.now().minusSeconds(60);
        var data = new DataPassada(passado);
        assertEquals(passado, data.valor());
    }

    @Test
    void deveAceitarDataNoPresente() {
        Instant agora = Instant.now();
        var data = new DataPassada(agora);
        assertEquals(agora, data.valor());
    }

    @Test
    void deveCriarDataValidaQuandoUsarAgora() {
        var data = DataPassada.agora();
        assertNotNull(data.valor());
        assertFalse(data.valor().isAfter(Instant.now()));
    }
}
