package estruturaDados.list.arrayList;

import java.util.Arrays;
import java.util.List;


/*Aqui estão as principais diferenças:

    Imutabilidade:
        List.of(): Totalmente imutável. Métodos .add(), .remove() ou .set() lançam UnsupportedOperationException.
        Arrays.asList(): A estrutura é fixa (não pode adicionar/remover), mas os elementos podem ser alterados com .set().
    Elementos Nulos (null):
        List.of(): Não aceita elementos null, lançando NullPointerException.
        Arrays.asList(): Aceita elementos null.
    Comportamento com Arrays:
        List.of(array): Cria uma cópia dos elementos do array, então mudanças posteriores no array original não afetam a lista.
        Arrays.asList(array): A lista é "backed" (baseada) no array. Alterar o array altera a lista. */

public class ListOf {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(null, 2, 3, 4, 5, 6);
        numeros.set(5, 10); //Aceitando a nossa alteração no índice 5, alterando o valor 6 pelo valor 10
        System.out.println(numeros);

        List<Integer> numeros2 = List.of(1,2,3,4,5,6);
        // numeros2.add(8); // UnsupportedOperationException
    }
}
