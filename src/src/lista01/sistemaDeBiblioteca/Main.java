package lista01.sistemaDeBiblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Alquimista", "Paulo Coelho", 1988, 123456);

        livro1.exibirInformacoes();

        livro1.emprestar();
        livro1.exibirInformacoes();

        livro1.emprestar();

        livro1.devolver();
        livro1.exibirInformacoes();

        livro1.devolver();
    }
}
