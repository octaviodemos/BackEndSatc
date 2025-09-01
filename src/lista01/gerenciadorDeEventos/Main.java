package lista01.gerenciadorDeEventos;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Show de Rock", "25/12/2025", "Estádio Central", 3);
        evento.exibirDetalhes();

        System.out.println("\n--- Realizando Inscrições ---\n");
        evento.verificarDisponibilidade();
        evento.inscrever("Carlos");
        evento.inscrever("Ana");
        evento.inscrever("Pedro");
        evento.inscrever("Mariana");

        System.out.println("\n--- Detalhes Finais ---\n");
        evento.verificarDisponibilidade();
        evento.exibirDetalhes();
    }
}