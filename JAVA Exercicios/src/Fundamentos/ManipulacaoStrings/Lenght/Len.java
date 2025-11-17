package Fundamentos.ManipulacaoStrings.Lenght;

public class Len {

    public static void main(String[] args) {

        //Declarando uma string
        String frase = "public static void main";

        // Em Java, length é usado para obter o tamanho de um array (como uma propriedade, nomeDoArray.length) Para arrays, a propriedade .length retorna o número de elementos
        // e length() é um metodo para obter o número de caracteres em uma String.Enquanto para strings,o metodo .length() retorna o número de caracteres, incluindo espaços em branco.

        System.out.println(String.format("frase possui %d caracteres", frase.length()));
    }
}
