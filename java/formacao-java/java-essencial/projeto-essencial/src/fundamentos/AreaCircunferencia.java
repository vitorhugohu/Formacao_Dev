package fundamentos;

public class AreaCircunferencia {
    // raio com o valor de 10
    // PI 3,1415 (constante)

    // Area -> PI * raio ao Quadrado

    // 3.1415 (double): é um dos tipos de dados do Java que permite que crie valores com casas decimais 

    // Normalmente as letras das constants são maiúsculas

    static void main() {
        final double PI = 3.1415;
        double raio = 10;
        double area = PI * (raio * raio);
        System.out.print(area + " m2");
    }
}
