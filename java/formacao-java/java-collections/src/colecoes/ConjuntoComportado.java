package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class ConjuntoComportado {
    static void main() {
        // Generics - anotação: <> específica o tipo que você quer usar
        // Set<String> listaAprovados = new HashSet<>(); // permitir ter apenas o tipo string
        SortedSet<String> listaAprovados = new TreeSet<>(); // vai exigir a ordenação
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucca");
        listaAprovados.add("Pedro");

        for(String aprovado: listaAprovados) {
            IO.println(aprovado);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums) {
            IO.println(n);
        }
    }
}
