package nepsAcademy.aprovadoReprovado;

import java.util.Scanner;

public class AprovadoReprovado{

    public static void verificacao(float a, float b){
        if (a > 0 && a <=10){
            if (b > 0 && b <=10){
                float resultado = media(a, b);
                if (resultado >= 7){
                    System.out.println("Aprovado");
                } else if (resultado > 4) {
                    System.out.println("Recuperacao");
                }else{
                    System.out.println("Reprovado");
                }
            }
        }
    }

    public static float media(float a, float b){
        return (a+b)/2;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            float b= sc.nextFloat();
            verificacao(a, b);
    }
}
