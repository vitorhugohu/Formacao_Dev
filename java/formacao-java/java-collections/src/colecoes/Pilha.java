package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    static void main() {
        // Last IN/First OUT (LIFO)
        Deque<String> livros = new ArrayDeque<>();
        livros.push("O pequeno Prícipe"); // adiciona elementos
        livros.add("Don Quixote");
        livros.push("O Hobbit");

        IO.println(livros.peek());
        IO.println(livros.pop()); // Pega o primeiro elemento da pilha e tira ele da pilha
        IO.println(livros.poll());
        IO.println(livros.poll());

        //livros.clear(); // limpa a pilha
        // livros.contains(); // verifica se um elemento está contido na minha pilha
        IO.println(livros.size());
        IO.println(livros.isEmpty()); // retorna um booleano, usado para saber se minha pilha está vazia ou não
        
    }
}
