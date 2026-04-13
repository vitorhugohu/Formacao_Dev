package arrays;

import java.util.Arrays;

public class ArrayBasico {
    static void main() {
        double[] notas = new double[4];
        IO.println(Arrays.toString(notas));

        notas[0] = 7.9;
        notas[1] = 8;
        notas[2] = 6.7;
        notas[3] = 9.7;

        IO.println(Arrays.toString(notas)); // Convete o array para o formato string, para ser possivel ver o array no terminal

        for(int i = 0; i < notas.length; i++) {
            IO.println(notas[i]);
        }

    }
}