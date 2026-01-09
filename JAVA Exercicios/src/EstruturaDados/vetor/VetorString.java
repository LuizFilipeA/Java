package EstruturaDados.vetor;

public class VetorString {
    public static void main(String[] args) {
        //Declarando um vetor de string com todos os vetores já inseridos
        String[] estadosNordeste = {"MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA"};

        //Declarando um vetor de tamanho 4 e inserindo um a um, pelo índice do vetor
        String[] estadosSudeste = new String[4];
        estadosSudeste[0] = "SP";
        estadosSudeste[1] = "MG";
        estadosSudeste[2] = "RJ";
        estadosSudeste[3] = "ES";
        //Note que o vetor possua tamanho 4, o índice começa no número zero. Ou seja: 0, 1, 2 e 3 (tamanho 4)

        //Percorrendo o vetor estadosNordeste com o laço de repetição for: Enquanto a variável i, que começa com valor zero, for menor que o lenght(tamanho) do vetor com todos os Estados do Nordeste, incremente i+1 (até chegar o valor do lenght)
        for (int i = 0; i<estadosNordeste.length; i++){
            System.out.println(estadosNordeste[i] + " - posição no vetor: "+i);
        }

        //Imprimindo o hash do vetor estadosSudeste
        System.out.println("Imprimindo o hash do vetor estadosSudeste: "+ estadosSudeste);

        //Imprimindo o hash do vetor estadosNordeste
        System.out.println("Imprimindo o hash do vetor estadosNordeste: "+ estadosNordeste);
    }
}