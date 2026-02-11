package nepsAcademy.fliper;

import java.util.Scanner;

public class Fliper {

    // Cada portinha pode estar na posição 0, que significa virada para a esquerda, ou na posição 1 que quer dizer virada para a direita.

    // Você deve escrever um programa que, dadas as posições das portinhas PP e RR, diga por qual dos três caminhos, A, B ou C, a bolinha vai cair!

    /*O número P pode ser 0 ou 1. O número R pode ser 0 ou 1. */

    private static void verificarCaminho(int p, int r) {
        if (p == 0) {
            System.out.println("C");
        } else if (r == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }

    private static void coletarDados() {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();

        if (p == 0 || p == 1) {
            if (r == 0 || r == 1) {
                verificarCaminho(p, r); //Usando uma função recursiva
            } else {
                System.out.println("Valor de R inválido. Deve ser 0 ou 1.");
            }
        } else {
            System.out.println("Valor de P inválido. Deve ser 0 ou 1.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        coletarDados();
    }
}