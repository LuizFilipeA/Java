package nepsAcademy.valoresEntre;

import java.util.Scanner;

public class DoisNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();

        int inicio = Math.min(primeiroNumero, segundoNumero);
        int fim = Math.max(primeiroNumero, segundoNumero);

        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

