package Fundamentos.EntradaDeDados;
import java.util.Scanner;

public class BemVindo {
    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: \n");
        nome = sc.next();
        System.out.println("Seja bem vindo, "+nome);

    }
}
