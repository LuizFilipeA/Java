package nepsAcademy.valoresEntre;

import java.util.Scanner;

public class DoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b){
            while (a<=b){
                System.out.print(a+" ");
                a++;
            }
        }else{
            while (a>=b){
                System.out.print(b+" ");
                b++;
            }
        }
    }
}
