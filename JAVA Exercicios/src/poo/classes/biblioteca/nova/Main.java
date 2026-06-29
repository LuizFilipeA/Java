package poo.classes.biblioteca.nova;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(3);
        Livro livro1 = new Livro("Clean Code", "Robert C. Martin");
        Livro livro2 = new Livro("Effective Java", " Joshua Bloch");
        Livro livro3 = new Livro("Java Concurrency in Practice", "Brian Goetz");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivros();

        livro1.emprestar();
        biblioteca.listarLivros();
        livro1.emprestar();
        biblioteca.listarLivros();

        livro1.devolver();
        livro1.devolver();
        biblioteca.listarLivros();
    }
}
