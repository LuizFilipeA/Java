package nepsAcademy.premioMilhao;

    /*Entrada

A primeira linha da entrada contém um número inteiro NN, que indica o número de dias que a lista contém. Cada uma das linhas seguintes contém um único inteiro AA, o número de acessos em um dia. O primeiro número dado indica o número de acessos no primeiro dia, o segundo número dado indica o número de acessos no segundo dia, e assim por diante.
Saída

Seu programa deve escrever na saída uma única linha, contendo um único número inteiro, o número de dias que foram necessários para a soma dos acessos à pagina de Alice e Bia chegar a 1000000.*/


import java.util.Scanner;

public class PremioMilhao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        final int capacidadeTotal = sc.nextInt();
        int totalDias[] = new int[capacidadeTotal];
        for (int i = 0; i < capacidadeTotal; i++) {
            totalDias[i] = sc.nextInt();
            soma += totalDias[i];
            if(soma >= 1000000){
                System.out.println(i + 1);
                break;
            }
        }

    }
}
