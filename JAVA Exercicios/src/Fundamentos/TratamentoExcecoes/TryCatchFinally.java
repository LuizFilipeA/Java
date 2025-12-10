package Fundamentos.TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


//
public class TryCatchFinally {
    public static void main(String[] args) {

        //Declarações
        String str = "null"; // "null" sem aspas não possui posição de memória alocada, não inicializada
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
            System.out.println("Tamanho da variável str(null = 4 letras): "+str.length());

            //Erro de resto de divisão por zero (ArithmeticException) ( altere o numero apos a barra por 0_
            x = 10/1;
            System.out.println("Resultado da divisão x é: "+x);

            // Erro consultando um index que não existe na memória (IndexOutOfBoundsException) = passe um parametro maior que 3
            System.out.println("Acessando posição 5 da String s(ABC): "+s.charAt(1));

            // InputMismatchException = ocorre quando o metodo Scanner espera um tipo de dado específico (como int, double) e o usuário insere um valor de tipo diferente
            System.out.println("Número inteiro da variável a: "+a);

            // neste caso, escolhemos npe como nome, Catch recebe como parametro o nome da exception apresentada e logo após, nós nomeamos o nome dessa função catch,
        }catch (NullPointerException npe){
            System.err.println("A variável não possui valor atribuido");
        }catch (ArithmeticException ae){
            System.err.println("Não é possível realizar uma divisão por 0.");
        }catch (IndexOutOfBoundsException siobe){
            System.err.println("Acesso negado,posição de memória inválida.");
        }catch (InputMismatchException ime){
            System.err.println("Informe um número inteiro. ");
        }finally {
            System.out.println("Fechando o programa...");
        }
    }
}
