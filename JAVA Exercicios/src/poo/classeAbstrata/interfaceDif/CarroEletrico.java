package poo.classeAbstrata.interfaceDif;

public abstract class CarroEletrico extends Veiculo implements Eletrico{

    private int bateria;

    public CarroEletrico(String modelo){
        super.modelo = modelo;
    }
}
