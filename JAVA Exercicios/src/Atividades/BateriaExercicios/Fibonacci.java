package Atividades.BateriaExercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;
        Scanner leitor = new Scanner(System.in);
        int termofinal = leitor.nextInt();
        for (int i = 0; i < termofinal; i++) {
            int termo3 = termo1+termo2;
            termo1 = termo2;
            termo2 = termo3;
        }
        System.out.println(termo2);
    }
}
