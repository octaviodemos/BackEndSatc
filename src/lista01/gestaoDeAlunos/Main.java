package lista01.gestaoDeAlunos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Octavio", 20, "202312233", "Engenharia de Software");
        aluno1.adicionarNota(8.5);
        aluno1.adicionarNota(9.0);
        aluno1.adicionarNota(9.5);
        aluno1.exibirBoletim();

        System.out.println("\n--------------------------\n");

        Aluno aluno2 = new Aluno("Ana Laura", 19, "2024002", "Engenharia de Software");
        aluno2.adicionarNota(8.0);
        aluno2.adicionarNota(2.5);
        aluno2.adicionarNota(10.0);
        aluno2.exibirBoletim();
    }
}