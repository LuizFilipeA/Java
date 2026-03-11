package nepsAcademy.tabuada;

import java.util.Scanner;

// x * i = valor
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(x+" * "+i+" = "+x*i);
        }
    }
}
