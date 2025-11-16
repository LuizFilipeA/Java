package Fundamentos.ManipulacaoStrings.Format;

public class Format {

    public static void main(String[] args) {
        String nome = "Luiz Felipe";
        int idade = 26;

        //Format é uma função da classe string (String.format()) que pode formatar strings

        //No exemplo abaixo, format dentro de um sout, primeiro parametro é a nossa string formatada e os outros parametros sao as variáveis que iremos utilizar no print

        System.out.println(String.format("Olá, meu nome é %s e tenho %d anos", nome, idade)); //%s e %d indicam string e um decimal

        // Pode ser armazenada dentro de uma variável também
        String format = String.format("Olá, meu nome é %s e tenho %d anos", nome, idade);
        System.out.println(format);
    }
}
