package nepsAcademy.lampadas;

import java.util.Scanner;

public class Lampadas {

    /*1. Há duas lampadas (LA e LB) no quarto
    2. Há dois interruptores (I1 e I2)
    3. Ao apertar o I1, se a Lampada A estiver apagada, fica acesa e se tiver acesa, apaga.
    4. Ao apertar o I2, cada uma das lampadas A e B trocam de estado. (Se tiver apagada fica acesa e se tiver acesa, apaga.

    Entrada
    O primeiro número indica quantas vezes seu amigo irá apertar algum interruptor
    O segundo número indica qual interruptor ele irá apertar (1 ou 2)

    * */

    public static int ligaDesliga(int lampada){
        if(lampada== 0){
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {

        int lampadaA = 0;
        int lampadaB = 0;

        Scanner sc = new Scanner(System.in);
        int capacidade = sc.nextInt();
        int[] interruptores = new int[capacidade];
        for(int i = 0; i < capacidade; i++){
            interruptores[i] = sc.nextInt();
            if(interruptores[i] == 1){
                lampadaA = ligaDesliga(lampadaA);
            } else if(interruptores[i] == 2){
                lampadaA = ligaDesliga(lampadaA);
                lampadaB = ligaDesliga(lampadaB);
            }
        }
        System.out.println(lampadaA);
        System.out.println(lampadaB);
        sc.close();
    }

}