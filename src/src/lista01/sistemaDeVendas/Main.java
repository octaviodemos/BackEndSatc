package lista01.sistemaDeVendas;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado Mecânico", "TEC-001", 350.00, 10);
        produto.exibirProduto();

        System.out.println("\n--- Realizando Operações ---\n");
        produto.vender(5);
        produto.vender(10);
        produto.exibirProduto();

        produto.repor(8);
        produto.exibirProduto();

        produto.vender(12);
        produto.exibirProduto();
    }
}