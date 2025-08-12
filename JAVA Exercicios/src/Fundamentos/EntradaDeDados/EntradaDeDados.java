package Fundamentos.EntradaDeDados;
import java.util.Scanner;
public class EntradaDeDados {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = sc.next();
        System.out.println("Qual sua idade?");
        idade = sc.nextInt();
        System.out.println("Cadastro concluido.\nNome: "+nome+"\nIdade: "+idade);
    }
}

