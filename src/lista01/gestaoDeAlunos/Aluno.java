package lista01.gestaoDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String _nome;
    private int _idade;
    private String _matricula;
    private String _curso;
    private List<Double> _notas;

    public Aluno(String nome, int idade, String matricula, String curso) {
        this._nome = nome;
        this._idade = idade;
        this._matricula = matricula;
        this._curso = curso;
        this._notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        this._notas.add(nota);
        System.out.println("Nota " + nota + " adicionada para o aluno " + _nome);
    }

    public double calcularMedia() {
        if (_notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (double nota : _notas) {
            soma += nota;
        }
        return soma / _notas.size();
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("A média final do aluno " + _nome + " é: " + String.format("%.2f", media));
        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }

    public void exibirBoletim() {
        System.out.println("=== BOLETIM DO ALUNO ===");
        System.out.println("Nome: " + _nome);
        System.out.println("Matrícula: " + _matricula);
        System.out.println("Curso: " + _curso);
        System.out.println("Notas: " + _notas);
        verificarAprovacao();
        System.out.println("========================");
    }
}