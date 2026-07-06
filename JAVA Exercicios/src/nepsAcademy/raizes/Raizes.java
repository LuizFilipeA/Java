package nepsAcademy.raizes;

import java.util.Scanner;

public class Raizes {

    /*Raízes

Seu professor lhe passou um exercício onde você deve encontrar a raiz quadrada de vários números, como você não quer perder tempo com essa tarefa tosca e sem sentido você resolveu fazer um programa que dados NN números ele retorna a raiz quadrada de cada um desses números

A primeira linha de entrada contém um número inteiro NN representando a quantidade de números dos quais você terá que responder qual a raiz quadrada. A segunda linha da entrada contém os NN números separados por um espaço em branco.

Seu programa deve imprimir NN linhas, cada uma contendo a raiz do número na ordem, cada raiz com precisão de 4 casas decimais.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity =scanner.nextInt();
        double[] sqrt= new double[capacity];
        for(int i=0;i<capacity;i++){
            sqrt[i]=Math.sqrt(scanner.nextDouble());
        }
        for(int i=0;i<capacity;i++){
            System.out.printf("%.4f\n", sqrt[i]);
        }

        scanner.close();
    }
}
