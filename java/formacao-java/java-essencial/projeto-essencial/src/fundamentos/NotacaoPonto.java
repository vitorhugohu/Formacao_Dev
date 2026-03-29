package fundamentos;

public class NotacaoPonto {
    // target -> alvo, replacement -> oq vai ser substituido
    public static void main() {
        String texto = "Bom dia X";
        texto = texto.replace("X", "Senhora");
        texto = texto.toUpperCase();

        System.out.println(texto);

        String nome = "vitor".toUpperCase().replace("R", "X");
        System.out.println(nome);
    }

}
