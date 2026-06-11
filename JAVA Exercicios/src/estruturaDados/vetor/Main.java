package estruturaDados.vetor;
//Em Java, vetores são estruturas de dados que armazenam um conjunto de valores do mesmo tipo. Também são conhecidos como arrays.

public class Main {
    public static void main(String[] args) {

        // Declaração de um vetor quando você já conhece o tamanho final e os valores dele
        int[] idades = {10, 15, 20, 25, 30};

        for  (int i=0; i<5; i++){
            System.out.println(idades[i]);
        }

        //Declaração de um vetor quando você só conhece o tamanho, mas ainda não sabe quais valores vão preencher o vetor.
        int[] idades2 = new int[10];

        //CURIOSIDADE 1: Se você declarar um vetor de inteiros, mas não atribuir nenhum valor a ele, o Java irá preencher automaticamente o vetor com o valor padrão do tipo de dado, que é 0 para inteiros. Ou seja, mesmo que você não tenha atribuído valores ao vetor idades2, ele já contém 10 elementos, todos com o valor 0.
        System.out.println(idades2[0]); // Imprime 0
        System.out.println(idades2[9]); // Imprime 0

    }
}
