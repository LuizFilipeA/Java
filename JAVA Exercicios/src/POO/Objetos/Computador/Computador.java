package POO.Objetos.Computador;

public class Computador {
    public boolean liga = false;

    public void ligar(){
        liga = true;
        System.out.println("Ligando");
    }

    public void desligar(){
        liga = false;
        System.out.println("Desligando...");
    }

}

