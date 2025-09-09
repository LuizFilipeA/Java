package Atividades.BateriaExercicio2.Banco;

public class Conta {
    double saldo = 0;

    public void deposito(double quantia){
        this.saldo = saldo + quantia;
    }

    public void saque(double quantia){
        this.saldo = saldo + quantia;
    }

    public void transferir(Conta destinatario, double quantia){
        this.saque(quantia);
        destinatario.deposito(quantia);
    }

    public void mostrarSaldo(){
        System.out.println("Saldo R$: "+saldo);
    }
}
