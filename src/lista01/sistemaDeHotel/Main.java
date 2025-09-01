package lista01.sistemaDeHotel;

public class Main {
    public static void main(String[] args) {
        Quarto quartoSimples = new Quarto(101, "Simples", 150.00);
        Quarto quartoSuite = new Quarto(205, "Master", 350.50);

        quartoSimples.exibirDados();
        quartoSuite.exibirDados();

        System.out.println("\n--- TENTANDO RESERVAR ---\n");

        quartoSimples.reservar();
        quartoSuite.reservar();
        quartoSimples.reservar();

        System.out.println("\n--- ESTADO APÓS RESERVAS ---\n");

        quartoSimples.exibirDados();
        quartoSuite.exibirDados();

        System.out.println("\n--- CALCULANDO ESTADIA ---\n");

        quartoSimples.calcularValor(5);
        quartoSuite.calcularValor(3);

        System.out.println("\n--- LIBERANDO QUARTOS ---\n");

        quartoSimples.liberar();
        quartoSuite.liberar();
        quartoSimples.liberar();

        System.out.println("\n--- ESTADO FINAL ---\n");

        quartoSimples.exibirDados();
        quartoSuite.exibirDados();
    }
}