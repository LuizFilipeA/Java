package nepsAcademy.ZerinhoOuUm;


import java.util.Scanner;

/*Entrada
A entrada é composta de uma única linha, que contém três inteiros AA, BB e CC, indicando respectivamente os valores escolhidos por Alice, Beto e Clara.

Saída
Seu programa deve produzir uma única linha, contendo um único caractere. Se o vencedor é Alice o
caractere deve ser 'A', se o vencedor é Beto o caractere deve ser 'B', se o vencedor é Clara o caractere deve ser 'C' e se não há vencedor o caractere deve ser '*' (asterisco).
*/


public class Zerinho {

    public static String vencedor(int a, int b, int c) {
        if (a == b && a == c) {
            return "*";
        }else if (a == b){
            return "C";
        }else if (a == c) {
            return "B";
        }else{
            return "A";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //ALice
        int b = sc.nextInt(); //Beto
        int c = sc.nextInt(); //Clara

        System.out.println(vencedor(a, b, c));

    }
}
