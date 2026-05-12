package poo.generics.ex3;


//Declarando uma classe genérica <T>, chamada caixa,

//T é um tipo genérico. Você pode pensar assim: “O tipo será definido depois na criação/instância do objeto”.

import java.util.ArrayList;
import java.util.List;

public class Caixa<T> {

    //Essa classe vai receber um valor
    private T valor;

    public static void main(String[] args) {
        // Instanciando a classe genérica, mas diferente das outras classes, o new Caixa vem acompanhado de <>, indicando que é uma classe genérica

        Caixa<String> caixa1 = new Caixa<>();
        caixa1.valor = "Hello world";

        //Exibindo chamando o atributo da classe genérica
        System.out.println(caixa1.valor);

        //Exibindo chamando o atributo da classe genérica, mas atribuindo a uma variável do tipo String, pois a classe genérica foi instanciada com o tipo String
        String variavel1 = caixa1.valor;
        System.out.println(variavel1);

        //Agora usaremos uma nova instância da mesma classe genérica mas dessa vez o valor será um string, sem precisar declarar outra classe
        Caixa<Integer> caixa2 = new Caixa<>();
        caixa2.valor = 5;
        System.out.println(caixa2.valor);

        //Já usavamos Generics na classe ArrayList, ou seja, uma lista que o tipo só será definidio na na hora de instanciar a classe,
        // mas agora estamos criando nossa própria classe genérica, e o mais interessante é que podemos usar a mesma classe para armazenar diferentes tipos de dados,
        // sem precisar criar uma nova classe para cada tipo de dado.
        List<String> lista = new ArrayList<>(); //note o <>


    }
}
