package colecoes;

import java.util.HashSet;

@SuppressWarnings("all")
public class ConjuntoBaguncado {

    static void main() {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        IO.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');

         IO.println("Tamanho é " + conjunto.size());

         IO.println(conjunto.remove("Teste"));

         IO.println(conjunto.contains("Teste"));

         IO.println(conjunto.contains(1));

         IO.println(conjunto.contains(true));

         HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        IO.println(conjunto);
        IO.println(nums);

        // conjunto.retainAll(nums); // intersecao
        conjunto.addAll(nums); // união
        IO.println(conjunto);

        conjunto.clear(); // limpa o conjunto
        IO.println(conjunto);
    }

    // método é uma função dentro de uma class
}