package fundamentos;

public class ConversorTemperatura {
    static void main() {
        double fahrenheit = 71;
        final double celsius = (fahrenheit - 32) * 5/9;
        System.out.print(celsius);
    }
}
