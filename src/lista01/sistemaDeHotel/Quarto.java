package lista01.sistemaDeHotel;

public class Quarto {

    private int _numero;
    private String _tipo;
    private double _precoPorNoite;
    private boolean _estaOcupado;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this._numero = numero;
        this._tipo = tipo;
        this._precoPorNoite = precoPorNoite;
        this._estaOcupado = false;
    }

    public void reservar() {
        if (!this._estaOcupado) {
            this._estaOcupado = true;
            System.out.println("Quarto " + _numero + " reservado com sucesso.");
        } else {
            System.out.println("Quarto " + _numero + " já está ocupado.");
        }
    }

    public void liberar() {
        if (this._estaOcupado) {
            this._estaOcupado = false;
            System.out.println("Quarto " + _numero + " liberado com sucesso.");
        } else {
            System.out.println("Quarto " + _numero + " já está livre.");
        }
    }

    public double calcularValor(int dias) {
        double valorTotal = dias * this._precoPorNoite;
        System.out.println("O valor para " + dias + " dias no quarto " + _numero + " é: R$ " + String.format("%.2f", valorTotal));
        return valorTotal;
    }

    public void exibirDados() {
        System.out.println("=== DADOS DO QUARTO ===");
        System.out.println("Número: " + _numero);
        System.out.println("Tipo: " + _tipo);
        System.out.println("Preço por Noite: R$ " + String.format("%.2f", _precoPorNoite));
        System.out.println("Status: " + (_estaOcupado ? "Ocupado" : "Livre"));
        System.out.println("=======================");
    }
}