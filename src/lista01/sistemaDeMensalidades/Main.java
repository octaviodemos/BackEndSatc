package lista01.sistemaDeMensalidades;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate vencimento1 = hoje.minusDays(10);
        LocalDate vencimento2 = hoje.plusDays(15);

        Mensalidade mensalidadeAtrasada = new Mensalidade("Fernanda Lima", 300.00, vencimento1);
        Mensalidade mensalidadeEmDia = new Mensalidade("Ricardo Borges", 300.00, vencimento2);

        System.out.println("Data de hoje: " + hoje + "\n");

        mensalidadeAtrasada.exibirStatus();
        mensalidadeAtrasada.verificarAtraso(hoje);

        System.out.println("\n----------------------------\n");

        mensalidadeEmDia.exibirStatus();
        mensalidadeEmDia.verificarAtraso(hoje);

        System.out.println("\n--- Realizando Pagamento ---\n");
        mensalidadeAtrasada.verificarAtraso(hoje);
        mensalidadeAtrasada.exibirStatus();
    }
}