package Looping;

import java.util.ArrayList;

/** O for é uma estrutura de controle em lógica de programação que permite repetir um bloco de código um número específico de vezes.
 * É ideal quando se sabe exatamente quantas vezes o código deve ser executado, n vezes ou percorrer listas...
 * O corpo do for é executado até que uma condição opcional se torne falsa **/

public class For {
    public static void main(String[] args) {

        //O for é composto por três partes: Inicialização, Condição, Incremento. No exemplo a seguir iremos de 1 até 10
        for (int i=1; i<=10 ; i++){
            System.out.println(i);
        }

        //O for também é conhecido como "para". A ideia é " Para cada "valor dentro da lista" imprima na tela. Isso é uma iteração.
        String[] lista = {"Pedro", "João", "Paulo", "Romário", "Neymar", "Cristiano Ronado", "Messi", "Arlindo Cruz"};
        for (String nome : lista){
            System.out.println(nome);
        }
    }
}
