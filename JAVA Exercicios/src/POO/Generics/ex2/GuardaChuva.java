package POO.Generics.ex2;

public class GuardaChuva {

    String modelo;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "GuardaChuva: " +modelo;
    }
}
