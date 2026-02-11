package nepsAcademy.soma;

/* Faça um programa que leia dois números inteiros digitados pelo teclado e imprima a soma deles.

A entrada consiste de dois números inteiros XX e YY, um em cada linha.

A saída do seu programa deve ser um inteiro SS, representando a soma de XX e YY.
*/

import java.util.Scanner;

public class Soma {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int s = soma(x, y);
        System.out.println(s);

        sc.close();
    }
}
