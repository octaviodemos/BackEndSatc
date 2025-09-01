package lista01.sistemaDePedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int _numeroPedido;
    private List<String> _itens;
    private double _valorTotal;
    private String _status;

    public Pedido(int numeroPedido) {
        this._numeroPedido = numeroPedido;
        this._itens = new ArrayList<>();
        this._valorTotal = 0.0;
        this._status = "Em preparo";
    }

    public void adicionarItem(String item, double valor) {
        this._itens.add(item);
        this._valorTotal += valor;
        System.out.println("Item '" + item + "' adicionado ao pedido " + _numeroPedido + ".");
    }

    public void alterarStatus(String novoStatus) {
        this._status = novoStatus;
        System.out.println("Status do pedido " + _numeroPedido + " alterado para: " + _status);
    }

    public void exibirResumo() {
        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Número do Pedido: " + _numeroPedido);
        System.out.println("Itens: ");
        for (String item : _itens) {
            System.out.println(" - " + item);
        }
        System.out.println("Valor Total: R$ " + String.format("%.2f", _valorTotal));
        System.out.println("Status: " + _status);
        System.out.println("========================");
    }
}