package CadastroAlunos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ValidadorCPF {

    public static void inserircpf(){
        try {
            Scanner sc = new Scanner(System.in);
            int cpf[] = new int[11];
            int contador = 1;
            for (int i = 0; i < 11; i++) {
                System.out.println("Digite individualmente cada número do seu cpf. \nDigito " + (i + 1) + ": ");
                cpf[i] = sc.nextInt();
                if (cpf[i] > 9 || cpf[i] < 0) {
                    System.out.println("Insira dados válidos.");
                    inserircpf();
                } else if (contador == 11) {
                    break;
                } else {
                    contador = contador + 1;
                }
            }
            System.out.println("CPF Cadastrado: "+cpf[0]+cpf[1]+cpf[2]+"."+cpf[3]+cpf[4]+cpf[5]+"."+cpf[6]+cpf[7]+cpf[8]+"-"+cpf[9]+cpf[10]);
        }catch (InputMismatchException ime){
            System.err.println("Digite números inteiros de 0 a 9. ");
            inserircpf();
        }
    }

    public static void main(String[] args) {
        inserircpf();
    }
}
