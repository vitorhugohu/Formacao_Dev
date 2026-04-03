package desafio;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        double superiorA = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        System.out.println(superiorA);

        double superiorB = Math.pow((1 - 5) * (2 - 7) / 2, 2);
        System.out.println(superiorB);

        double superior = Math.pow(superiorA - superiorB, 3);
        System.out.println(superior);

        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println(resultado);
    }
}
