package Atividades.AtividadeTratamentoDados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        //Crie um algoritmo que armazene o nome, a idade e a média do aluno e exiba na tela.
        //Trate exceções ao lidar com entradas inválidas.

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantos alunos você deseja cadastrar? ");
            int qtdalunos = sc.nextInt();

            int idades[] = new int[qtdalunos];
            String nomes[] = new String[qtdalunos];
            double medias[] = new double[qtdalunos];

            // Permita aos usuários inserir nome idade e notas
            for (int i = 1; i<= qtdalunos; i++){ // range 1 a 10

                System.out.println("Digite o nome do aluno "+i+".");
                String nome = sc.next();
                nomes[i-1] = nome;

                System.out.println("Digite a idade do aluno "+i);
                int idade = sc.nextInt();
                idades[i-1] = idade;

                System.out.println("Digite a média do aluno "+i+".");
                double media = sc.nextDouble();
                medias[i-1] = media;
            }

            //Exibindo resultados dos três vetores
            for (int i = 0; i < qtdalunos; i++){ // range 0 a 9 pois o índice começa na posição [0]
                System.out.println("Nome: "+nomes[i] +" - Anos de idade: "+idades[i]+" - Média: "+medias[i]);
            }

        }catch (InputMismatchException ime){
            System.out.println("Insira dados válidos");
        }
    }
}
