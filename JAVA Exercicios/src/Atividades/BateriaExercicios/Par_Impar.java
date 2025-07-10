package Atividades.BateriaExercicios;//Bino e Cino gostam muito de brincar de par ou ímpar. Bino sempre escolhe par e Cino sempre escolhe ímpar.
//Faça um programa para automatizar o resultado o jogo de par ou ímpar. Seu programa deve ler a quantidade de dedos que cada um utilizou e imprimir o nome do ganhador.
//A entrada consiste de duas linhas. A primeira linha contém a quantidade de dedos que Bino utilizou. A segunda linha contém a quantidade de dedos que Cino utilizou.
//A saída consiste de uma linha. Caso Bino vença o jogo, imprima "Bino". Caso Cino vença o jogo, imprima "Cino".
//Como Bino e Cino só tem 10 dedos (contando as duas mãos), os valores fornecidos serão valores entre 0 e 10.

import java.util.Scanner;
public class Par_Impar {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
            int n1 = leitor.nextInt();
            int n2 = leitor.nextInt();
            int resultado = (n1+n2);
            if (resultado % 2==0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
    }
}
