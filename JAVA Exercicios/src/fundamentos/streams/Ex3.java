package fundamentos.streams;

import java.util.Arrays;
import java.util.List;

/*Exercício 1: O Filtro Básico (Fácil)

Você tem a seguinte lista de números inteiros:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

O que fazer: Use Streams para:

    Filtrar apenas os números que são pares.

    Multiplicar cada um desses números pares por 2.

    Imprimir o resultado de cada um na tela usando o forEach*/
public class Ex3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream()
            .filter(numero -> numero %2 ==0)
            .map(numero -> numero * 2)
                //forEach
            .forEach(numero -> System.out.print(" "+numero));

        //ou
        numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra apenas os números pares
                .map(numero -> numero * 2) // Multiplica cada número filtrado por
                .forEach(System.out::print);
    }

    //.forEach(): É um consumidor. Ele "come" os dados e encerra a conversa. Retorna void.


}
