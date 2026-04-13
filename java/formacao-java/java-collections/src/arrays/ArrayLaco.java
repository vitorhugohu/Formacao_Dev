package arrays;

import java.util.Arrays;

public class ArrayLaco {
    static void main() {
        double[] notas = { 9.9, 8.7, 7.2, 9.4, 6.9 };
        // foreach
        for(double nota: notas) {
            IO.println(nota);
        }

        IO.println(Arrays.toString(notas));
    }
}
