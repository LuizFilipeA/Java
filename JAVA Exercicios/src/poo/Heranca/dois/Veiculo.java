package poo.Heranca.dois;

/*Exercício Fácil

Crie:

Uma classe Veiculo com:
atributo marca
metodo mover() que imprime "O veículo está se movendo"
Uma classe Carro que herda de Veiculo:
metodo buzinar() que imprime "Bip bip"
✔️ Objetivo:

No main, crie um objeto Carro e chame:

mover()
buzinar()*/

public class Veiculo {

    void mover(){
        System.out.println("O veículo está se movendo");
    }
    void buzinar(){
        System.out.println("Bi bi");
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.mover();
        veiculo.buzinar();
    }
}
