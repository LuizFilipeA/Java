package Atividades.BateriaExercicio2.Biblioteca.Entidade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1- Adicionar usuário \n2- Adicionar livro \n3- Sair");
            byte opcao = sc.nextByte();
            
            if(opcao == 1){
                System.out.println("Adicionar usuário");
            } else if (opcao == 2) {
                System.out.println("Adicionar livro");
            } else if (opcao == 3) {
                break;
            }else{
                System.out.println("Opção inválida");
            }

        }
        System.out.println("Fechando...");
    }
}
