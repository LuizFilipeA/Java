package POO.bancoSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String titular = sc.next();
        System.out.println("Com qual valor iremos iniciar a conta? ");
        float valor = sc.nextFloat();
        BancoSimples bs = new BancoSimples(titular, valor);

        while (true){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            byte opcaoCliente = sc.nextByte();
            if (opcaoCliente == 1){
                System.out.println("Digite o valor do depósito: ");
                float deposito = sc.nextFloat();
                bs.depositar(deposito);
            } else if (opcaoCliente == 2) {
                System.out.println("Digite o valor do saque");
                float value = sc.nextFloat();
                bs.sacar(value);

            } else if (opcaoCliente == 3) {
                bs.getSaldo(titular);
            } else if (opcaoCliente == 4) {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}
