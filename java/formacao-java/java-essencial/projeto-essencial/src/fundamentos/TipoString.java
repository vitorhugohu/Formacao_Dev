package fundamentos;

public class TipoString {
    
    static void main() {
        final String texto = "   Boa tarde    ".trim();

        System.out.println(texto.concat("!!!"));
        System.out.println(texto.startsWith("tarde"));
        System.out.println(texto.toLowerCase().startsWith("boa"));
        System.out.println(texto.equalsIgnoreCase("boa tarde"));
        System.out.println(texto.length());

        String nome = "Pedro";
        String sobrenome = "Santos";
        int idade = 33;
        double salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }

}
