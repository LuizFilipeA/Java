package fundamentos.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

//Imagine o reduce como uma função de "dobradura" (fold): você pega uma lista de itens e vai combinando-os par a par até que reste apenas um.
public class Ex5{
    public static void main(String[] args) {
        var numeros = List.of(1, 2, 3, 4, 5, 10);

        //Soma
        var soma = numeros.stream()
                // Identity (Identidade): O valor inicial da operação e também o valor padrão caso a stream esteja vazia. identity = 0, para inicializar a soma com o valor 0
                .reduce(0, Integer::sum); //O reduce em Java Streams é uma operação terminal que combina todos os elementos de uma stream para produzir um único valor, como a soma, máximo, mínimo ou concatenação.
        System.out.println(soma);

        //Soma2 sem armazenar em estrutura de dados
             numeros.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println); //Sem o identity, o resultado é um Optional<Integer>, ou seja, um valor que pode ou não estar presente. Isso ocorre porque, sem um valor inicial, a operação de redução pode não ter um resultado definido se a stream estiver vazia.

        var mult =  numeros.stream()
                .reduce(1, (x, y) -> x * y); // O identity é 1, para inicializar a multiplicação com o valor 1, já que multiplicar por 0 resultaria em 0, o que não é desejável para uma operação de multiplicação.
        System.out.println(mult);

    }
}