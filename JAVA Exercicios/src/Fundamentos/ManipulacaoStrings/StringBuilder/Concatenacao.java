package Fundamentos.ManipulacaoStrings.StringBuilder;

public class Concatenacao {

    public static void main(String[] args) {
        //Concatenação - Metodo 1 utilizando mais memória
        String frase1 = "1º String + ";
        frase1 += "2º String ";
        frase1 += "3º String ";

        //Concatenação - Metodo 2 utilizando menos memória com o StringBuilder
        StringBuilder frase2 = new StringBuilder();
        frase2.append("1º StringBuilder ");
        frase2.append("2º StringBuilder ");
        frase2.append("3º StringBuilder ");

        System.out.println(frase1);

        //Na saída de dados utilizando a funcao toString do objeto "frase2"
        System.out.println(frase2.toString());
    }
}
