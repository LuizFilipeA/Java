package POO.Atividade.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario();
        Livro book = new Livro();
        book.cadastrarUsuario();
        book.adicionarLivro();
        book.pegarEmprestado();
    }
}