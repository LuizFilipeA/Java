package POO.Atividade.Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Usuario user = new Usuario();
        Livro book = new Livro();
        user.cadastrarUsuario();
        book.adicionarLivro();
        user.pegarEmprestado();
        user.exibirUsuarios();

    }
}