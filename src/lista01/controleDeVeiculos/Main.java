package lista01.controleDeVeiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota Corolla", "QWE-1234", 2023, 15000.0);
        carro.exibirStatus();

        System.out.println("\n--- Operações de Locação ---\n");
        carro.alugar();
        carro.alugar();
        carro.exibirStatus();

        carro.devolver(550.5);
        carro.exibirStatus();

        carro.devolver(100);
    }
}