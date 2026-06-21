package nepsAcademy.provaAlternativa.minhaVersao;

import java.util.Scanner;

//Entrada
//A entrada contém um único conjunto de testes, que deve ser lido do dispositivo de entrada padrão. A primeira linha da entrada contém um único inteiro NN, indicando o número de questões da prova. A segunda linha da entrada contém uma cadeia de NN caracteres, indicando o gabarito da prova. A terceira linha da entrada contém outra cadeia de NN caracteres, indicando as opções marcadas pelo candidato. Ambas as cadeias contêm apenas os caracteres 'A', 'B', 'C', 'D' e 'E' (sempre em letra maiúscula).

//Saída
//Seu programa deve imprimir na saída padrão uma única linha contendo um único inteiro, indicando o número de acertos do candidato.

public class MinhaV {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdAcertos = 0;
        int qtdQuestoes = sc.nextInt();
        String gabaritoString = sc.next();
        String respostaAlunos = sc.next();
        char[] gabaritoStringArray = gabaritoString.toCharArray();


        for (int i=0; i<qtdQuestoes; i++){
            if (gabaritoStringArray[i] == respostaAlunos.charAt(i)){
                qtdAcertos++;
            }
        }

        System.out.println(qtdAcertos);
    }



}
