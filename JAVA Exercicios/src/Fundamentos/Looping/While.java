package Fundamentos.Looping;

//estrutura de repetição que executa um conjunto de instruções enquanto uma condição for verdadeira. É útil quando não se sabe o número de vezes que um bloco de comandos deve ser executado.
//A sintaxe básica do while é: while (condição) , // bloco de código a ser repetido, .
//A condição é avaliada antes da execução do bloco de código. Se a condição for verdadeira, o bloco de código é executado. Se a condição for falsa, o loop é encerrado.

public class While {
    public static void main(String[] args) {
        //While, ou enquanto, é um laço que dura até a condição se realizar, enquanto não atender a condição, o while será um looping infinito.

        int n = 1;
        while (n < 1){ //Enquanto n for menor que um, faça tal coisa...
            System.out.println("Fazendo tal coisa");
            n = 2; //Quebrando o looping infinito, agora n é igual a 2, logo a condição de enquanto n for menor que um se torna falsa
        }

        //É possível utilizar o while quando você sabe quantas vezes serão necessárias, ou até mesmo quando precisar de um número de vezes que nao sabe ainda mas obedece uma condição
        while (n <=10){
            System.out.println(n);
            n++; // incrementando n + 1 a cada repetição o mesmo que "n = n + 1"
        }
    }
}
