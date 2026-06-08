package poo.classeAbstrata.interfaceDif;

public interface Eletrico {

    void carregarBateria();

    default void statusBateria(){
        System.out.println("Verificando bateria!");
    }
}
