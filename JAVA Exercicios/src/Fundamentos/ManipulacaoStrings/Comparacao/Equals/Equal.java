package Fundamentos.ManipulacaoStrings.Comparacao.Equals;

public class Equal {
    public static void main(String[] args) {

        //Testando o metodo equals
        String frase1 = "Bom dia!";
        String frase2 = "Boa tarde!";
        String frase3 = "BOM DIA!";
        String frase4 = null;
        boolean compararnulo;
        boolean asFrasesSaoIguais;

        //Metodo Equals comparando 2 strings e retornando um boolean
        asFrasesSaoIguais = frase1.equals(frase2);
        System.out.println("As frases 1 e 2 sao iguais? " + asFrasesSaoIguais);

        //Case sensitive
        asFrasesSaoIguais = frase1.equals(frase3);
        System.out.println("frase1 = frase3? " + asFrasesSaoIguais); //"Bom dia!" == "BOM DIA!"??, java possui case sensitive entao o boolean retornara false

        //Ignore Case Sensitive com equalsIgnoreCase(OutraStringParaSerComparada) - NON SENSITIVE
        asFrasesSaoIguais = frase1.equalsIgnoreCase(frase3);
        System.out.println("Ignorando o case sensitive, as frases sao iguais?: " +asFrasesSaoIguais);

        // ABAIXO SEGUE O METODO ERRADO A SE FAZER, QUANDO DESEJAR COMPARAR UMA STRING COM UM VALOR NULO. SEMPRE RETORNARÁ TRUE
        //compararnulo = frase4.equalsIgnoreCase(frase2);
        //System.out.println("Null? " +compararnulo); //RETORNA TRUE

        //Forma simples de resolver a comparação null é com operador ternário
        compararnulo = frase4 != null ? true : false;
        System.out.println(compararnulo);

    }

}
