package nepsAcademy.consecutivos;

import java.util.Scanner;


/*
Entrada

A primeira linha da entrada contém um inteiro NN, o número de valores sorteados. A segunda linha contém NN valores, V1,V2,…,VNV1​,V2​,…,VN​, na ordem de sorteio, separados por um espaço em branco.
Saída

Seu programa deve imprimir apenas uma linha, contendo apenas um inteiro, indicando o número de pontos do participante.*/
public class Consecutivo {
    public static void main(String[] args) {

        //A primeira linha da entrada contém um inteiro NN, o número de valores sorteados.
        Scanner scanner = new Scanner(System.in);
        int qtdElementos = scanner.nextInt();
        int sequenciaAtual = 1;
        int maiorSequencia = 1;

        //ponto chave
        int anterior = scanner.nextInt();

        //A segunda linha contém NN valores, V1, V2, VN... na ordem de sorteio

        //Começando o valor do for em =1 pq ja coletamos o "anterior", entao o for inicia a partir do "2ª elemento do indice, e o for vai até o numero de elementos
        for (int i = 1; i < qtdElementos; i++) {
            int termo = scanner.nextInt();
            if (termo == anterior) {
                sequenciaAtual++;
            }else{
                sequenciaAtual = 1;
            }

            if (sequenciaAtual > maiorSequencia) {
                maiorSequencia = sequenciaAtual;
            }
            //Depois que o laço se fecha, atualizamos o termo, para que na proxima repetição o laço possa avançar mais um termo
            anterior = termo;
        }
        System.out.println(maiorSequencia);
    }
}
