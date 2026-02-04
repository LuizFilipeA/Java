package estruturaDados.ordenacao.bubbleSort;

public class BubbleSort {

    //Algoritmo de ordenação que percorre a lista várias vezes comparando elementos adjacentes e trocando-os se estiverem na ordem errada.
    // Ao final de cada iteração o maior elemento ainda não ordenado "borbulha" para o final da lista.

    // Quando usar? 1 Quando a simplicidade é mais importante que a performance. 2- Contextos educacionais. 3- Para listas muito pequenas (e que já estao quase ordenadas)

    public static void bubbleSort(int[] arr) {

        for (int i =0; i < arr.length -1; i++){
            for (int j= 0; j< arr.length -1 -i; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5,3,8,4,2};

        System.out.println("Antes da ordenação: ");
        for (int num : numeros){
            System.out.println("Elemento: "+num);
        }
        bubbleSort(numeros);

        System.out.println("Depois da ordenação: ");
        for (int num : numeros) {
            System.out.println("Elemento: " + num);
        }
    }
}