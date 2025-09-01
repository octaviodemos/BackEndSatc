package lista01.sistemaDeVendas;

public class Produto {

    private String _nome;
    private String _codigo;
    private double _preco;
    private int _estoque;

    public Produto(String nome, String codigo, double preco, int estoque) {
        this._nome = nome;
        this._codigo = codigo;
        this._preco = preco;
        this._estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && this._estoque >= quantidade) {
            this._estoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidade(s) de " + _nome + " realizada.");
        } else {
            System.out.println("Venda não realizada. Estoque insuficiente de " + _nome + ".");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            this._estoque += quantidade;
            System.out.println("Reposição de " + quantidade + " unidade(s) de " + _nome + ".");
        }
    }

    public void exibirProduto() {
        System.out.println("=== DADOS DO PRODUTO ===");
        System.out.println("Nome: " + _nome);
        System.out.println("Código: " + _codigo);
        System.out.println("Preço: R$ " + String.format("%.2f", _preco));
        System.out.println("Estoque: " + _estoque + " unidades");
        System.out.println("========================");
    }
}