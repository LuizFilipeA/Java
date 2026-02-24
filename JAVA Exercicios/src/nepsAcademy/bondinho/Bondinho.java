package nepsAcademy.bondinho;

import java.util.Scanner;

public class Bondinho {
    public static void main(String[] args) {

        final int capacidade= 50;

        Scanner sc = new Scanner(System.in);
        int qtdAlunos = sc.nextInt();
        int qtdMonitores = sc.nextInt();
        int totalpessoas = qtdAlunos + qtdMonitores;

        if (totalpessoas <= 50) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
