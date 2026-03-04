package nepsAcademy.repeticao;

import java.util.Scanner;

public class Repeticao {

    public static void repetirVezes(int quantidade){
        for (int i = 0; i< quantidade; i++){
            System.out.println("NepsAcademy eh Sucesso");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        repetirVezes(quantidade);
    }
}
