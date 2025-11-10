package Fundamentos.Casting;

public class Main {
    public static void main(String[] args) {
        // Exemplo De int para double
        int valorInteiro = 3;
        double valorDouble = valorInteiro;
        System.out.println("valorInteiro: "+valorInteiro+" valorDouble: "+valorDouble); //(int = 3, double = 3.00)

        //Exemplo De double para int
        float n3 = 3.30f;
        int n4;
        n4 = (int)n3; //Um casting explícito, o java entende que nós aceitamos perder os valores após a virgula
        System.out.println("n3: "+n3+" n4: "+n4); //(float = 3.30, int =3)

        //Exemplo De char para string
        char letra= 's';
        String palavra = String.valueOf(letra);
        System.out.println("String: "+palavra);

        //Exemplo De string para char
        String s = "String"; //Uma string nada mais é do que um vetor de caracteres
        char c = s.charAt(5); //Com a função charAt, somos obrigados a informar o indice, ou seja, qual char da string nós queremos armazenar, neste caso, armazenamos o char de posição 5 da palavra String, ou seja, o char "g"
        System.out.println("Char: "+c);

        //Exemplo De int para string

        String teste = String.valueOf(n4);
        System.out.println("Sim, isso é uma string"+teste);
    }

}
