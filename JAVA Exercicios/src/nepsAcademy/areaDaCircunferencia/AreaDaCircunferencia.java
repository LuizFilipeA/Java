package nepsAcademy.areaDaCircunferencia;

import java.util.Scanner;

public class AreaDaCircunferencia {

    // Entrada - ler um valor real R, representando o raio da circunferencia que iremos calcular a area. Podemos adotar pi=3.1416.

    //Saída - consiste de uma única linha contendo a área da circunferência com duas casas de precisão.

    // A = pi.r²

    public static void calculaArea(float raio){
        float area = 3.1416f*(raio*raio);
        System.out.printf("%.2f", area); //A principal diferença é que println imprime texto e pula para a próxima linha automaticamente, sendo ideal para saídas simples. Já o printf (print format) permite formatar strings e números com marcadores %, como casas decimais, sem pular de linha automaticamente.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float raio = sc.nextFloat();
        calculaArea(raio);

    }
}
