package Atividades.BateriaExercicio2.Banco;

public class Conta {
    double saldo = 0;

    public void deposito(double quantia){
        this.saldo = saldo + quantia;
    }

    public void saque(double quantia){
        this.saldo = saldo - quantia;
    }

    public void transferir(Conta destinatario, double quantia){
        this.saque(quantia);
        destinatario.deposito(quantia);
    }

    @Override
    public String toString(){
        return ("Saldo: R$ "+getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
