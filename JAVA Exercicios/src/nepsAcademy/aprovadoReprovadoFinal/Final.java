package nepsAcademy.aprovadoReprovadoFinal;

import java.util.Scanner;

public class Final {
    // Média n1 + média n2 = >= 7 aprovado, < 3 recuperação

    public static float media(float a, float b){
        return (a+b)/2;
    }

    public static void verificacao(float resultado){
        if (resultado >= 7){
            System.out.println("Aprovado");
        } else if (resultado < 3) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Final");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float resultado = media(n1, n2);
        verificacao(resultado);

    }
}
