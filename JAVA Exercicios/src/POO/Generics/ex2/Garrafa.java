package POO.Generics.ex2;

public class Garrafa {

    private String nome;

    public void setNome(String nome){
        this.nome= nome;
    }

    @Override
    public String toString() {
        return "Garrafa: " + nome;
    }
}
