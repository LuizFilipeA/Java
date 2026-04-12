package fundamentos.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Exercício Sugerido

Agora é sua vez! Tente resolver o seguinte desafio:

O cenário: Você tem uma lista de números inteiros: 1, 5, 8, 9, 2, 20, 15, 3.

Sua missão:

    Crie uma Stream a partir dessa lista.

    Filtre apenas os números pares.

    Multiplique cada número filtrado por 2.

    Use o coletor .collect(Collectors.toList()) para salvar o resultado em uma nova lista e imprima essa lista final.*/

public class Ex1{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 8, 9, 2, 20, 15, 3);


        List<Integer> filtrados = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra apenas os números pares
                .map(n -> n * 2) // Multiplica cada número filtrado por 2
                .collect(Collectors.toList()); // Coleta o resultado em uma nova lista chamada "filtrados"

        System.out.println(filtrados);
    }
}