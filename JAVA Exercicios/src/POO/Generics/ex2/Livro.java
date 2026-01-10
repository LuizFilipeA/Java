package POO.Generics.ex2;

public class Livro {
    private String nome;

    public Livro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro: " + nome;
    }
}
