package Fundamentos.ManipulacaoStrings.Contains;

public class ContainString {

    public static void main(String[] args) {
        String frase = "Formula mágica da paz";
        //Verificando se a String frase contém (contain) a palavra "paz"
        boolean contemPaz = frase.contains("paz");
        System.out.println(contemPaz);

        //CONTAIN + UPPER
        String upper = frase.toUpperCase();
        contemPaz = upper.contains("PAZ");
        System.out.println(contemPaz);
    }
}
