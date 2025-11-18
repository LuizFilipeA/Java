package Fundamentos.ManipulacaoStrings.Replace;

public class Replace {

    public static void main(String[] args) {

        //O replace varre a string procurando por todas as palavras a serem substituidas,
        //no teste abaixo, nós verificamos se iria substituir apenas a primeira palavra "python" por java, porém, todas as 3 palavras "python" foram substituidas pela palavra "java" até o fim da string
        String frase1= "Eu programo em python python python";
        String frase2 = frase1.replace("python", "java");

        System.out.println(frase2);
    }
}
