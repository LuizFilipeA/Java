package Fundamentos.EntradaDeDados;
import java.util.Scanner;
public class EntradaDeDados {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = leitor.next();
        System.out.println("Qual sua idade?");
        idade = leitor.nextInt();
        System.out.println("Cadastrado. Nome: "+nome+" Idade: "+idade);
    }
}
