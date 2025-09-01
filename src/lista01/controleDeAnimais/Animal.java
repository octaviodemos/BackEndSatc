package lista01.controleDeAnimais;

public class Animal {

    private String _nome;
    private String _especie;
    private int _idade;
    private double _peso;
    private String _dono;
    private String _ultimoCuidado;

    public Animal(String nome, String especie, int idade, double peso, String dono) {
        this._nome = nome;
        this._especie = especie;
        this._idade = idade;
        this._peso = peso;
        this._dono = dono;
        this._ultimoCuidado = "Nenhum cuidado registrado.";
    }

    public void alimentar(double quantidadeEmGramas) {
        double aumentoDePeso = quantidadeEmGramas / 1000 * 0.1; // Supõe que 10% da comida vira peso
        this._peso += aumentoDePeso;
        this._ultimoCuidado = "Alimentado com " + quantidadeEmGramas + "g.";
        System.out.println("O animal " + _nome + " foi alimentado. Novo peso: " + String.format("%.2f", _peso) + " kg.");
    }

    public void darBanho() {
        this._ultimoCuidado = "Recebeu um banho.";
        System.out.println("O animal " + _nome + " tomou um banho!");
    }

    public void exibirFicha() {
        System.out.println("=== FICHA DO ANIMAL ===");
        System.out.println("Nome: " + _nome);
        System.out.println("Espécie: " + _especie);
        System.out.println("Idade: " + _idade + " anos");
        System.out.println("Peso: " + String.format("%.2f", _peso) + " kg");
        System.out.println("Dono(a): " + _dono);
        System.out.println("Último Cuidado: " + _ultimoCuidado);
        System.out.println("=======================");
    }
}