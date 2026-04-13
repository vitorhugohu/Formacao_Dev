package basico;

public class Data {
    int dia;
    int mes;
    int ano;

    String formatar() {
        return String.format("Data: %02d/%02d/%d", this.dia, this.mes, this.ano);
    }

    public String toString() {
        return this.formatar();
    }
}