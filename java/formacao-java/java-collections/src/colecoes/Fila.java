package colecoes;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Fila {
    static void main() {
        // FIFO - First IN/First OUT
        Queue<String> fila = new ArrayBlockingQueue<>(5);
        fila.add("Ana"); // adiciona um elemento na fila(lança uma exceção caso estaja cheia a fila)
        fila.offer("Bia"); // adiciona um elemento na fila(retorna um false caso a fila esteja cheia)
        fila.add("Carlos");
        fila.add("Daniel");
        fila.add("Rafaela");

        IO.println(fila.peek()); // pega primeiro da fila (retorna o elemento ou null, caso nao tenha nenhum elemento na fila)
        IO.println(fila.element()); // pega primeiro da fila (lança uma exceção, caso nao tenha nenhum elemento na fila)
    
        IO.println(fila.poll()); // pega o primeiro elemento da fila e remove ele da fila (retorna null caso nao encontre o elemento)
        IO.println(fila.remove()); // pega o primeiro elemento da fila e remove ele da fila (retorna uma exceção caso nao encontre o elemento)

        IO.println(fila.size());

     }
}