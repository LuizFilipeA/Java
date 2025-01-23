package POO.ArraysObjetos;

/* Listas em Java são estruturas de dados que armazenam elementos de forma ordenada e dinâmica. Elas são uma das estruturas de dados mais importantes do Java e são úteis para lidar com vários valores relacionados.
As listas são flexíveis porque não têm um tamanho fixo, permitindo a adição e remoção de elementos a qualquer momento.
Para criar uma lista em Java, pode-se usar a interface List e escolher uma implementação concreta, como ArrayList, LinkedList, Vector ou Stack.
Algumas das características das listas em Java são:
Os índices das listas são baseados em zero.
É possível manipular os elementos da lista com base na sua posição.
É possível remover elementos da lista.
É possível procurar ocorrências de um elemento na lista.
É possível percorrer sequencialmente todos os elementos da lista. */
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        ArrayList playlist = new ArrayList<>();
        playlist.add("Yunk Vino");
        System.out.println(playlist.get(0));
        playlist.add(2);
        System.out.println(playlist.get(1));

    }
}
