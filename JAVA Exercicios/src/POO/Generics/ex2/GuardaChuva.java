package POO.Generics.ex2;

public class GuardaChuva {

    public GuardaChuva(String modelo) {
    }

    String modelo;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "GuardaChuva: " +modelo;
    }
}
