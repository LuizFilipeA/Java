package Fundamentos.Funcoes;
import java.util.Scanner;

public class Recursiva_fibonacci {
    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos termos da sequência fibonacci você quer?");
        int n = sc.nextInt();
        System.out.println("Sequência fibonacci: "+fibonacci(n));
    }
}
