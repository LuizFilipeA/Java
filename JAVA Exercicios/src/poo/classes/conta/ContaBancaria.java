package poo.classes.conta;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            return;
        }
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

}
