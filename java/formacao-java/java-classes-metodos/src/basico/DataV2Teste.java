package basico;

public class DataV2Teste {
    static void main() {
        DataV2 d1 = new DataV2(25, 12, 2024);
        DataV2 d2 = new DataV2();
        d2.dia = 7;
        DataV2 d3 = new DataV2(15);
        d2.dia = 7;
        IO.println(d1);
        IO.println(d2);
        IO.println(d3); 
    }
}
