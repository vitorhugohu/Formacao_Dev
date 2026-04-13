package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    static void main() {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Vitor");
        usuarios.put(5, "Tiago");

        IO.println(usuarios.size());
        IO.println(usuarios.isEmpty());

        IO.println(usuarios.keySet()); // conjunto das chaves
        IO.println(usuarios.values()); // Valores
        IO.println(usuarios.entrySet()); // conjunto das entradas 

        IO.println(usuarios.containsKey(20)); // retorna um booleano, verifica se uma chave está contida ou não no meu Map
        IO.println(usuarios.containsValue("Carlosss")); // retorna um booleano, verifica se um valor está contido ou não no meu Map 

        IO.println(usuarios.get(20)); // pega um elemento do meu Map através da sua chave
        IO.println(usuarios.remove(1)); // remove um elemento do meu Map através da chave
        IO.println(usuarios.remove(5, "tiago")); // remove um elemento do meu Map através da chave e do valor (a chave e o valor precisa ser iguais para poderem serem removidos, caso contrário irá ser retornado um false)

        for(int id: usuarios.keySet()) {
            IO.println(id);
        } // pega apenas a chava dos elementos do meu Map

        for(String nome: usuarios.values()) {
            IO.println(nome);
        } // pega apenas os valores dos elementos do meu Map

        for(Entry<Integer, String> registro: usuarios.entrySet()) {
            IO.println(registro.getKey() + " = " + registro.getValue());
        } // pega a chave e o valor dos elementos do meu Map
    }
}
