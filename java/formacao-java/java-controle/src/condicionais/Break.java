package condicionais;

public class Break {
    static void main() {

        for (int i = 1; i <= 10; i++) {
            if(i == 5) {
                break; // Interrompe e sai do laço indo para a linha seguinte ao laço
            }
            System.out.println(i);
        }

        System.out.println("Fim do programa");

    }
}
