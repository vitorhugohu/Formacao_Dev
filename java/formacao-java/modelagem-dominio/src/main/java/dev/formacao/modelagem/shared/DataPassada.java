package dev.formacao.modelagem.shared;

import java.time.Instant;
import java.util.List;

import dev.formacao.modelagem.utils.Validador;

public record DataPassada(Instant valor) {
    public static final String DATA_NULA = "DATA_NULA";
    public static final String DATA_NO_FUTURO = "DATA_NO_FUTURO";

    public DataPassada {
        List<String> erros = Validador.combinar(
            Validador.naoNulo(valor, DATA_NULA),
            (valor != null && !valor.isAfter(Instant.now())) ? null : DATA_NO_FUTURO);

        if (!erros.isEmpty()) {
            throw new IllegalArgumentException(String.join("; ", erros));
        }
    }

    public static DataPassada agora() {
        return new DataPassada(Instant.now());
    }
}
