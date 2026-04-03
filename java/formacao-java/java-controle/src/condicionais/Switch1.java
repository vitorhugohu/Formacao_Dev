package condicionais;

public class Switch1 {
    static void main() {
        int idade = 0;

        switch (idade) {
            case 2:
                System.out.println("Sabe falar");
            case 1: 
                System.out.println("Sabe andar");
            case 0: 
                System.out.println("Sabe respirar");
        }

        String faixa = "branca";

        switch (faixa) {
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei de nada!");
        }

        System.out.println("Fim do programa");
    }
}
