package POO.Atividade.Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Livro book = new Livro();
        book.adicionarLivro();
        book.exibirLivros();
        book.removerLivro();
        book.exibirLivros();
    }
}