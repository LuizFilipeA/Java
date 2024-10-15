package BateriaExercicios;//  Faça um programa para ler um inteiro x
//Imprima a mensagem "positivo" se o valor for positivo.
// Imprima a mensagem "negativo" caso o valor seja negativo.
// Imprima a mensagem "nulo" se o valor for zero.
//A entrada consiste de uma linha contendo um inteiro.
//A saída consiste de uma linha contendo uma mensagem.
//o valor fornecido não terá valor absoluto maior que 1000.
import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
        // Faça um programa para ler um inteiro
        //x. Imprima a mensagem "positivo" se o valor for positivo.
        // Imprima a mensagem "negativo" caso o valor seja negativo.
        // Imprima a mensagem "nulo" se o valor for zero.

        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        if (n>=1){
            System.out.println("positivo");
        }else if(n<0){
            System.out.println("negativo");
        }else{
            System.out.println("nulo");
        }
    }
}
