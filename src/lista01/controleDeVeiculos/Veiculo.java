package lista01.controleDeVeiculos;

public class Veiculo {

    private String _modelo;
    private String _placa;
    private int _ano;
    private boolean _estaAlugado;
    private double _quilometragem;

    public Veiculo(String modelo, String placa, int ano, double quilometragem) {
        this._modelo = modelo;
        this._placa = placa;
        this._ano = ano;
        this._quilometragem = quilometragem;
        this._estaAlugado = false;
    }

    public void alugar() {
        if (!_estaAlugado) {
            this._estaAlugado = true;
            System.out.println("Veículo " + _modelo + " placa " + _placa + " alugado com sucesso.");
        } else {
            System.out.println("Veículo " + _modelo + " já está alugado.");
        }
    }

    public void devolver(double kmRodados) {
        if (_estaAlugado) {
            this._estaAlugado = false;
            if (kmRodados > 0) {
                this._quilometragem += kmRodados;
            }
            System.out.println("Veículo " + _modelo + " devolvido. Quilometragem atualizada.");
        } else {
            System.out.println("Este veículo não estava alugado.");
        }
    }

    public void exibirStatus() {
        System.out.println("=== STATUS DO VEÍCULO ===");
        System.out.println("Modelo: " + _modelo);
        System.out.println("Placa: " + _placa);
        System.out.println("Ano: " + _ano);
        System.out.println("Quilometragem: " + String.format("%.1f", _quilometragem) + " km");
        System.out.println("Status: " + (_estaAlugado ? "Alugado" : "Disponível"));
        System.out.println("=========================");
    }
}