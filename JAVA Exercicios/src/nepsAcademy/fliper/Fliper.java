package nepsAcademy.fliper;

import java.util.Scanner;

public class Fliper {

    // Cada portinha pode estar na posição 0, que significa virada para a esquerda, ou na posição 1 que quer dizer virada para a direita.

    // Você deve escrever um programa que, dadas as posições das portinhas PP e RR, neste flíper da figura, diga por qual dos três caminhos, A, B ou C, a bolinha vai cair!

    /*O número PP pode ser 0 ou 1. O número RR pode ser 0 ou 1. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();

        if (p ==0){
            System.out.println("C");
        }else if(r == 0) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }

        sc.close();
    }
}