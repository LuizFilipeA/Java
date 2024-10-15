package AtividadeTratamentoDados;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ValidadorCPF {


    //Função sem retorno inserircpf()
    public static void inserircpf(){
        try {

            //Iniciando um objeto Scanner chamado"sc", declarando um vetor do tipo inteiro chamado "cpf" e criando uma variável chamada "contador" iniciando em 1.
            Scanner sc = new Scanner(System.in);
            int cpf[] = new int[11];
            int contador = 1;
            System.out.println("Digite individualmente cada número do seu cpf.");

            //Coletando cada espaço do vetor com entrada de dados pelo usuário utilizando um laço for
            for (int i = 0; i < 11; i++) {
                System.out.println("Digito " + (i + 1) + ": ");
                cpf[i] = sc.nextInt();
                /*Se o número digitado não estiver no conjunto de números {0, 1, 2, 3, 4, 5, 6, 7, 8 e 9}
                 o programa exibe um erro na tela e chama a função para o usuário inserir o cpf novamente.*/
                if (cpf[i] > 9 || cpf[i] < 0) {
                    System.out.println("Insira dados válidos.");
                    inserircpf();
                    // Quando o programa coletar 11 digitos com sucesso, então encerraremos nosso looping
                } else if (contador == 11) {
                    break;
                    // Se nenhuma das condições anteriores foram "ativadas" então o usuário digitou um número válido e o contador vai incrementando de acordo com os loopings;
                } else {
                    contador = contador + 1;
                }
            }
            // Exibindo o vetor na tela
            System.out.println("CPF Cadastrado: "+cpf[0]+cpf[1]+cpf[2]+"."+cpf[3]+cpf[4]+cpf[5]+"."+cpf[6]+cpf[7]+cpf[8]+"-"+cpf[9]+cpf[10]);
            //Tratamento de exceções
        }catch (InputMismatchException ime){
            System.err.println("Digite números inteiros de 0 a 9. ");
            inserircpf();
        }
    }
    public static void main(String[] args) {
        inserircpf();
    }
}
