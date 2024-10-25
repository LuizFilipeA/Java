package Atividades;

public class Main {
    public static void main(String[] args) {
        //Referencia classes
        Livro livro = new Livro();
        Autor autor = new Autor();
        Usuario usuario = new Usuario();
        usuario.cadastro();
        livro.adicionarLivro();
        livro.pegarEmprestado();
    }
}
