package estruturaDados.matriz;

public class Main {
    /*uma matriz é uma estrutura de dados bidimensional, ou seja, possui linhas e colunas. Ela é utilizada para armazenar e organizar dados de forma tabular,
    permitindo o acesso a elementos específicos por meio de índices de linha e coluna.  */

    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Criando uma matriz 3x3

        // Preenchendo a matriz com valores
        matriz[0][0] = 1; //linha 0, coluna 0
        matriz[0][1] = 2; //linha 0, coluna 1
        matriz[0][2] = 3; //linha 0, coluna 2
        matriz[1][0] = 4; //linha 1, coluna 0
        matriz[1][1] = 5; //elemento
        matriz[1][2] = 6; //linha 1, coluna 2
        matriz[2][0] = 7; //linha 2, coluna 0
        matriz[2][1] = 8; //linha 2, coluna 1
        matriz[2][2] = 9; //linha 2, coluna 2

        // Acessando um elemento específico
        int elemento = matriz[1][1]; // Acessa o elemento na linha 1, coluna 1 (valor 5)
        System.out.println("Elemento na posição (1,1): " + elemento);

        // Imprimindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) { //i representará as linhas
            for (int j = 0; j < matriz[i].length; j++) { // j representará as colunas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}