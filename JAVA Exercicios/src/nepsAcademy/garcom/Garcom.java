package nepsAcademy.garcom;

import java.util.Scanner;

public class Garcom {

    /*os garçons em treinamento deixam cair apenas bandejas que têm mais latas de bebidas que copos.
    Por exemplo, se uma bandeja tiver 10 latas e 4 copos, certamente o garçom em treinamento a deixará cair, quebrando os 4 copos.
    Já se a bandeja tiver 5 latas e 6 copos, ele conseguirá entregá-la sem deixar cair.


    /*A primeira linha da entrada contém um inteiro NN representando o número de bandejas que o garçom tentou entregar.

    As NNlinhas seguintes representam as N bandejas.
    Cada linha contém dois inteiros L e C, indicando o número de latas e o número de copos naquela bandeja, respectivamente.

    A saída deve conter um inteiro representando o número total de copos quebrados pelo garçom */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int coposquebrados = 0;
        int[] bandejas = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            int latas = sc.nextInt();
            int copos = sc.nextInt();
            if (latas > copos) {
                coposquebrados = coposquebrados + copos;
            }
        }

        System.out.println(coposquebrados);
    }
}