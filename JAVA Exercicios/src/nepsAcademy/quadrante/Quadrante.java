package nepsAcademy.quadrante;


//Faça um programa para ler dois inteiros XX e YY representando um ponto em um plano cartesiano.
// Imprima qual quadrante esse ponto de encontra. Caso o ponto esteja em algum eixo, imprima apenas a mensagem "eixos".

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 0 || y == 0){
            System.out.println("eixos");
        }else if (x > 0){
            if(y > 0){
                System.out.println("Q1");
            }else{
                System.out.println("Q4");
            }
        }else if(y > 0){
            System.out.println("Q2");
        }else{
            System.out.println("Q3");
        }
    }
}
