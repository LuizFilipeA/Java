package fundamentos.tratamentoExcecoes.v2;

import java.util.Scanner;

public class Excecoes {

    public static void main(String[] args) {

        try{
            int resultado = 10/0;
            System.out.println(resultado);
            System.out.println("Nunca será mostrado"); //depois da exceção ocorrer, o restante do bloco try é ignorado
        }catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        }

        try{
            int numero =Integer.parseInt("abc");
        }catch (NumberFormatException e) {
            System.out.println("Número inválido");
        }


        try (Scanner sc = new Scanner(System.in)) {

            int numero = sc.nextInt();
            //Scanner é fechado automaticamente, sem precisar de chamar o metodo close() explicitamente, pois o try-with-resources garante que o recurso seja fechado automaticamente ao final do bloco try.
        }
    }
}
