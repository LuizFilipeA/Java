package nepsAcademy.areaQuadrado;

import java.util.Scanner;

public class Area {

    public static int calcularArea(int n) {
        return n*n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcularArea(n));
    }
}
