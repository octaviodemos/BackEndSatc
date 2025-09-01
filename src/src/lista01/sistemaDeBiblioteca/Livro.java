package lista01.sistemaDeBiblioteca;

public class Livro {

    private String _titulo;
    private String _autor;
    private int _anoPublicacao;
    private int _codigoIsbn;
    private boolean _estaDisponivel;

    public Livro(String titulo, String autor, int anoPublicacao, int codigoIsbn) {
        this._titulo = titulo;
        this._autor = autor;
        this._anoPublicacao = anoPublicacao;
        this._codigoIsbn = codigoIsbn;
        this._estaDisponivel = true;
    }

    public boolean emprestar() {
        if (_estaDisponivel) {
            _estaDisponivel = false;
            System.out.println("Livro '" + _titulo + "' emprestado com sucesso!");
            return true;
        } else {
            System.out.println("Livro '" + _titulo + "' não está disponível para empréstimo.");
            return false;
        }
    }

    public boolean devolver() {
        if (!_estaDisponivel) {
            _estaDisponivel = true;
            System.out.println("Livro '" + _titulo + "' devolvido com sucesso!");
            return true;
        } else {
            System.out.println("Livro '" + _titulo + "' já está disponível na biblioteca.");
            return false;
        }
    }

    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO LIVRO ===");
        System.out.println("Título: " + _titulo);
        System.out.println("Autor: " + _autor);
        System.out.println("Ano de Publicação: " + _anoPublicacao);
        System.out.println("ISBN: " + _codigoIsbn);
        System.out.println("Disponibilidade: " + (_estaDisponivel ? "Disponível" : "Emprestado"));
        System.out.println("============================");
    }
}
