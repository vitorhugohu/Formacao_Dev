package basico;

public class MedicoTeste {
    static void main() {
        Medico plantonista1 = new Medico();
        plantonista1.id = 1;
        plantonista1.nome = "Nicolas";
        plantonista1.crm = "12345";
        plantonista1.salario = 60_000;

        System.out.println(plantonista1.nome);

        Medico plantonista2 = new Medico();
        plantonista2.id = 2;
        plantonista2.nome = "Maria";
        plantonista2.crm = "54321";
        plantonista2.salario = 70_000;
        plantonista2.especialidade = "Cardiologia";


        System.out.printf("O médico plantonista %s tem CRM %s", plantonista2.nome, plantonista2.crm);
    }
}
