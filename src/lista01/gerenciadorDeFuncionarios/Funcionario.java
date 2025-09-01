package lista01.gerenciadorDeFuncionarios;

public class Funcionario {

    private String _nome;
    private String _cargo;
    private double _salario;
    private int _matricula;
    private String _departamento;

    public Funcionario(String nome, String cargo, double salario, int matricula, String departamento) {
        this._nome = nome;
        this._cargo = cargo;
        this._salario = salario;
        this._matricula = matricula;
        this._departamento = departamento;
    }

    public void promover(String novoCargo, double aumento) {
        this._cargo = novoCargo;
        this._salario += aumento;
        System.out.println("Funcionário " + _nome + " promovido para " + _cargo +
                " com novo salário de R$ " + _salario);
    }

    public void transferir(String novoDepartamento) {
        this._departamento = novoDepartamento;
        System.out.println("Funcionário " + _nome + " transferido para o departamento: " + _departamento);
    }

    public void exibirDados() {
        System.out.println("=== DADOS DO FUNCIONÁRIO ===");
        System.out.println("Nome: " + _nome);
        System.out.println("Cargo: " + _cargo);
        System.out.println("Salário: R$ " + _salario);
        System.out.println("Matrícula: " + _matricula);
        System.out.println("Departamento: " + _departamento);
        System.out.println("============================");
    }
}
