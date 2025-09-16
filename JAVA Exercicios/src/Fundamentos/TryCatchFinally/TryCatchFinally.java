package Fundamentos.TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        //Declarações
        String str = "null"; // Null não possui posição de memória alocada
        String s ="ABC";
        int x;
        int a;

        //Instância do objeto scanner
        Scanner sc = new Scanner(System.in);

        try{
            // Capturando o valor do scanner e armazenando em "a"
            System.out.println("Digite um número inteiro: ");
            a = sc.nextInt();

            // Erro consultando um index que não existe na memória (NullPointerException)
            System.out.println("Tamanho da variável str: "+str.length());

            //Erro de resto de divisão por zero (ArithmeticException)
            x = 10/1;
            System.out.println("Resultado da divisão x é: "+x);

            // Erro consultando um index que não existe na memória (IndexOutOfBoundsException)
            System.out.println("Acessando posição 5 da String s: "+s.charAt(2));

            // Utilizaremos o exception, porém o nome do erro é InputMismatchException
            System.out.println("Número inteiro da variável a: "+a);

            // Catch recebe como parametro o nome do erro apresentado e logo após, nós nomeamos o nome dessa função catch,
            // neste caso, escolhemos npe como nome

        }catch (NullPointerException npe){
            System.err.println("A variável não possui valor atribuido");
        }catch (ArithmeticException ae){
            System.err.println("Não é possível realizar uma divisão por 0.");
        }catch (IndexOutOfBoundsException siobe){
            System.out.println("Acesso negado,posição de memória inválida.");
        }catch (InputMismatchException ime){
            System.out.println("Informe um número inteiro. ");
        }finally {
            System.out.println("Fechando o programa...");
        }
    }
}
