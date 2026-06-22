package nepsAcademy.mediaPonderada;

import java.util.Scanner;

public class MediaPonderada {

    public static float calculaMediaPonderada(float n1, float n2) {
        return (n1 * 2 + n2 * 3) / (2 + 3);
    }

    public static void mostraResultado(float mediaPonderada){
        if (mediaPonderada >= 7){
            System.out.println("Aprovado");
        } else if (mediaPonderada <3){
            System.out.println("Reprovado");
        }else {
            System.out.println("Final");
        }
    }

    public static void main(String[] args) {
        //n1 = 2
        //n2 = 3
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        mostraResultado(calculaMediaPonderada(n1, n2));
    }

}
