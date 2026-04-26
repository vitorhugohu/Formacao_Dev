package dev.formacao.modelagem.shared;

import java.util.List;
import java.util.UUID;

import dev.formacao.modelagem.utils.Validador;

public record IdUuid(String valor) implements Id {
    
    public IdUuid {
        List<String> erros = Validador.combinar(
            Validador.naoNulo(valor, ID_NULO),
            Validador.naoVazio(valor, ID_VAZIO)
        );

        if (!erros.isEmpty()) {
            throw new IllegalArgumentException(String.join(", ", erros));
        }

        try {
            UUID.fromString(valor);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ID_INVALIDO);
        }
    }

    public String valor() {
        return valor;
    }

    static public IdUuid novo() {
        return new IdUuid(UUID.randomUUID().toString());
    }
}
