package Fundamentos.ManipulacaoStrings.Comparacao.Equals;

public class Equal {
    public static void main(String[] args) {

        //Testando o metodo equals
        String frase1 = "Bom dia!";
        String frase2 = "Boa tarde!";
        boolean asFrasesSaoIguais = frase1.equals(frase2);
        System.out.println("As frases 1 e 2 sao iguais? " + asFrasesSaoIguais);

        //Case sensitive
        String frase3 = "BOM DIA!";
        asFrasesSaoIguais = frase1.equals(frase3);
        System.out.println("frase1 = frase3? " + asFrasesSaoIguais); //"Bom dia!" == "BOM DIA!"??, java possui case sensitive entao o boolean retornara false

        //Ignore CaseSensitive com equalsIgnoreCase(OutraStringParaSerComparada) - NON SENSITIVE
        asFrasesSaoIguais = frase1.equalsIgnoreCase(frase3);
        System.out.println("Ignorando o case sensitive, as frases sao iguais?: " +asFrasesSaoIguais);
    }
}
