package Fundamentos.Vetores;
//Em Java, vetores são estruturas de dados que armazenam um conjunto de valores do mesmo tipo. Também são conhecidos como arrays.

public class Main {
    public static void main(String[] args) {

        // Vetor quando você já conhece o tamanho final e os valores dele
        int idades[] = {10, 15, 20, 25, 30};

        //Vetor quando você só conhece o tamanho, mas ainda não sabe quais valores vão preencher o vetor.
        int[] idades2 = new int[10];
        for  (int i=0; i<5; i++){
            System.out.println(idades[i]);
        }
    }
}
