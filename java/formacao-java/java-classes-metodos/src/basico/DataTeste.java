package basico;

public class DataTeste {
    static void main(){
        Data d1 = new Data();
        d1.dia = 2;
        d1.mes = 10;
        d1.ano = 24;

        String data = d1.formatar();
        System.out.println(data);

        System.out.println(d1);
    }
}
