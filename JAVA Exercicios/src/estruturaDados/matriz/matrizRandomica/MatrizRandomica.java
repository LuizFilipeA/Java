package estruturaDados.matriz.matrizRandomica;

import java.security.SecureRandom;

public class MatrizRandomica {
    /*uma matriz é uma estrutura de dados bidimensional, ou seja, possui linhas e colunas. Ela é utilizada para armazenar e organizar dados de forma tabular,
    permitindo o acesso a elementos específicos por meio de índices de linha e coluna.  */

    public static void preencherMatriz(int[][] matriz, int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = new SecureRandom().nextInt(10);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz, int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int linha = 3;
        int coluna = 3;

        //preenchendo a matriz
        int[][] matriz = new int[linha][coluna]; // Criando uma matriz 3x3

        preencherMatriz(matriz, linha, coluna);
        imprimirMatriz(matriz, linha, coluna);
    }
}