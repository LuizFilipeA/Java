package Fundamentos.Funcoes;
import java.util.Scanner;

public class Recursiva_fibonacci {

    // A sequência de Fibonacci é uma série de números onde cada um é a soma dos dois anteriores, começando geralmente com 0 e 1.
    // 0,1, 1,2,3,5,8,13,21,34,55,89,144,…                  o primeiro termo é 1(0+1), o segundo termo é 2(1+1), o terceiro termo é 3 (1+2) o quarto é 5 (2+3)

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

