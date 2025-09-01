package lista01.sistemaDeMensalidades;

import java.time.LocalDate;

public class Mensalidade {

    private String _aluno;
    private double _valor;
    private LocalDate _dataVencimento;
    private boolean _estaPago;

    public Mensalidade(String aluno, double valor, LocalDate dataVencimento) {
        this._aluno = aluno;
        this._valor = valor;
        this._dataVencimento = dataVencimento;
        this._estaPago = false;
    }

    public void pagar() {
        if (!_estaPago) {
            this._estaPago = true;
            System.out.println("Pagamento da mensalidade de " + _aluno + " realizado.");
        } else {
            System.out.println("Esta mensalidade já foi paga.");
        }
    }

    public boolean verificarAtraso(LocalDate dataAtual) {
        boolean atrasado = dataAtual.isAfter(_dataVencimento) && !_estaPago;
        if (atrasado) {
            System.out.println("Mensalidade de " + _aluno + " está ATRASADA.");
        } else if (_estaPago) {
            System.out.println("Mensalidade de " + _aluno + " está PAGA.");
        } else {
            System.out.println("Mensalidade de " + _aluno + " está EM DIA.");
        }
        return atrasado;
    }

    public void exibirStatus() {
        System.out.println("=== STATUS DA MENSALIDADE ===");
        System.out.println("Aluno: " + _aluno);
        System.out.println("Valor: R$ " + String.format("%.2f", _valor));
        System.out.println("Data de Vencimento: " + _dataVencimento);
        System.out.println("Status: " + (_estaPago ? "Pago" : "Pendente"));
        System.out.println("=============================");
    }
}