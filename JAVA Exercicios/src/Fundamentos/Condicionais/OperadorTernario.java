package Fundamentos.Condicionais;

import java.util.Scanner;

public class OperadorTernario {

    //Função que recebe uma idade e retorna uma string informando se é maior ou menor de idade.
    public static String maiorDeIdade(byte idade){
        //Semelhante à um condicional como if/else, é extremamente útil para condições simples.
        //(condicao) ? se_true : se_false; (se for maior de idade)? caso seja verdade: casp seja falso;
        String resultado = (idade >= 18)? "Maior de idade": "Menor de idade";
        return resultado;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        byte idade = sc.nextByte();

        //chamando a nossa função declarada acima e passando idade como parâmetro
        System.out.println(maiorDeIdade(idade));
    }

}
