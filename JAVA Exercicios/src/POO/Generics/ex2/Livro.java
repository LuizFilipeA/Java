package POO.Generics.ex2;

public class Livro {
    private String nome;

     public void setNome(String nome) {
     this.nome  = nome; }

    @Override
    public String toString() {
        return "Livro: " + nome;
    }
}
