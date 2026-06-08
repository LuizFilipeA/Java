package poo.classeAbstrata.interfaceDif;

public class Carro extends Veiculo{

    public Carro (String modelo){
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    @Override
    //Sou obrigado a implementar o metodo abstrato frear vindo da super classe Veiculo
    public void frear() {

    }
}
