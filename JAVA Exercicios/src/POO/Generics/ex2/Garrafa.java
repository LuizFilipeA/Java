package POO.Generics.ex2;

public class Garrafa {

    private String nome;

    public Garrafa (String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Garrafa: " + nome;
    }
}
