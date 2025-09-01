package lista01.gerenciadorDeFuncionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Octavio", "Assistente de desenvolvimento", 2500.00, 002, "TI");

        funcionario1.exibirDados();

        funcionario1.promover("Especialista do Sistema", 2000.00);

        funcionario1.transferir("Comercial");

        funcionario1.exibirDados();
    }
}
