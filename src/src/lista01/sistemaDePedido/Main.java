package lista01.sistemaDePedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(101);
        pedido1.exibirResumo();

        System.out.println("\n--- Adicionando Itens e Alterando Status ---\n");
        pedido1.adicionarItem("Pizza Mussarela", 45.00);
        pedido1.adicionarItem("Refrigerante 2L", 10.00);
        pedido1.exibirResumo();

        pedido1.alterarStatus("Pronto");
        pedido1.exibirResumo();

        pedido1.alterarStatus("Entregue");
        pedido1.exibirResumo();
    }
}