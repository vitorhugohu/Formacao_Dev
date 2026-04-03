package condicionais;

public class Continue {
    static void main() {

        for (int i = 1; i <= 10; i++) {
            if(i % 2 != 0) {
                continue; // Interrompe a iteração atual e passa para a próxima
            }
            System.out.println(i);
            }
            System.out.println("Fim do programa");
        }

    

    }
