package Condicionais;

public class CondicionalAninhada {
    public static void main(String[] args) {

        //Verificando se um número é par, impar e se é possível ser divisível por 6
        int numero = 366;
        if (numero % 2 == 0) {
            if (numero % 3 == 0) {
                System.out.println(numero + " Também é divisível por 6");
            } else {
                System.out.println(numero + " Número par");
            }
        } else {
            System.out.println("Número impar");
        }
    }
}