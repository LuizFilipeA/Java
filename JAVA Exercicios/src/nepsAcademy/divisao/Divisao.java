package nepsAcademy.divisao;

import java.util.Scanner;

public class Divisao {

    public static float divisao(float a, float b){
        if (b == 0){
            return -1;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(divisao(a, b) == -1){
            System.out.println("Divisão impossível");
        } else {
            System.out.println(divisao(a, b));
        }
    }
}
