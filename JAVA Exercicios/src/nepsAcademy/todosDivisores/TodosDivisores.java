package nepsAcademy.todosDivisores;

import java.util.Scanner;

public class TodosDivisores{
    /*

Dado um número inteiro XX, encontre todos os divisores de XX.
Entrada

A entrada consiste de apenas uma linha contendo o número XX.
Saída

A saída do seu programa deve conter apenas uma linha com os divisores de XX separados por um espaço em branco. O divisores devem ser impressos em ordem crescente.
*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i<=x; i++){
            if (x % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}