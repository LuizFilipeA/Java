package poo.classes.conta;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria", 500);

        conta.depositar(250);
        if (conta.sacar(100)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }

        if (conta.sacar(1000)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }

        System.out.println("Saldo disponível: " + conta.consultarSaldo());
        System.out.println("Titular: "+conta.getTitular());
    }
}
