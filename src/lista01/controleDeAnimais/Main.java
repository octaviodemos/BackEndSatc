package lista01.controleDeAnimais;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Aurora", "Cachorro", 2, 15, "Maria");

        animal1.exibirFicha();

        animal1.alimentar(400);
        animal1.darBanho();

        animal1.exibirFicha();

        System.out.println("\n-----------------------------------\n");

        Animal animal2 = new Animal("Liz", "Gato", 1, 3, "Maria");

        animal2.exibirFicha();

        animal2.darBanho();
        animal2.alimentar(100);

        animal2.exibirFicha();
    }
}