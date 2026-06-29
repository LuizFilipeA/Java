package poo.classes.biblioteca.nova;

public class Biblioteca {

    private Livro[] livros;
    private int totalLivros;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.totalLivros = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (totalLivros >= livros.length) {
            return;
        }
        this.livros[totalLivros] = livro;
        this.totalLivros++;
    }

    public void listarLivros() {
        for (int i=0; i<this.totalLivros; i++) {
            System.out.println(this.livros[i].mostrarInformacoes());
        }
    }

    public String buscarPorTitulo(String titulo) {
        for (int i=0; i<this.totalLivros; i++) {
            if (titulo.equals(this.livros[i].getTitulo())) {
                return this.livros[i].mostrarInformacoes();
            }
        }
        return null;
    }

}

