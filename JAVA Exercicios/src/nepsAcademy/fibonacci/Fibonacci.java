package nepsAcademy.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    //Sequencia onde os dois primeiros termos são 1(0+1) e 2(1+1), e cada número subsequente é a soma dos dois anteriores.
    // 0,1,1,2,3,5,8,13,21,34,55,89,144...

    public static int fibonacci(int n) {
        if (n == 0 || n == 1){ //caso base + condição de parada
            return 1;
        }
        return fibonacci(n-1)+ fibonacci(n-2); // Se você pedir o Fibonacci de 4, ele diz: "Eu não sei o de 4, mas se você me der o de 3 e o de 2, eu somo os dois e te entrego". E assim ele vai descendo até chegar no caso base.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }


}
