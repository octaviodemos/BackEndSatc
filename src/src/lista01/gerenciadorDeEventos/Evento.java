package lista01.gerenciadorDeEventos;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String _nome;
    private String _data;
    private String _local;
    private int _capacidade;
    private List<String> _inscritos;

    public Evento(String nome, String data, String local, int capacidade) {
        this._nome = nome;
        this._data = data;
        this._local = local;
        this._capacidade = capacidade;
        this._inscritos = new ArrayList<>();
    }

    public void inscrever(String nome) {
        if (_inscritos.size() < _capacidade) {
            _inscritos.add(nome);
            System.out.println(nome + " inscrito(a) com sucesso no evento " + _nome + "!");
        } else {
            System.out.println("Inscrição de " + nome + " não realizada. Evento lotado.");
        }
    }

    public int verificarDisponibilidade() {
        int vagasDisponiveis = _capacidade - _inscritos.size();
        System.out.println("Vagas disponíveis para o evento " + _nome + ": " + vagasDisponiveis);
        return vagasDisponiveis;
    }

    public void exibirDetalhes() {
        System.out.println("=== DETALHES DO EVENTO ===");
        System.out.println("Nome: " + _nome);
        System.out.println("Data: " + _data);
        System.out.println("Local: " + _local);
        System.out.println("Capacidade: " + _capacidade + " pessoas");
        System.out.println("Inscritos: " + _inscritos.size());
        System.out.println("Lista de Inscritos: " + _inscritos);
        System.out.println("==========================");
    }
}