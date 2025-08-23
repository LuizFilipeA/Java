package POO.Biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaracoes e referencias do menu
        Book book = new Book();
        Writer writer = new Writer();
        User user = new User();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("O que deseja fazer?");
            System.out.println("1- Adicionar livros");
            System.out.println("2- Remover livros");
            System.out.println("3- Realizar empréstimo");
            System.out.println("4- Devolução");
            System.out.println("5- Exibir todos os livros disponíveis");
            System.out.println("6- Exibir histórico de empréstimos");
            System.out.println("7- Cadastrar novo usuário");
            System.out.println("8- Exibir lista de todos os usuários");
            System.out.println("9- Sair");
            int decisaoMenu = sc.nextInt();
            if (decisaoMenu == 1) {
                book.adicionarLivro();
            } else if (decisaoMenu == 2) {
                book.removerLivro();
            } else if (decisaoMenu == 3) {
                book.pegarEmprestado();
            } else if (decisaoMenu == 4) {
                System.out.println("Devolvendo livro... Função incompleta");
            } else if (decisaoMenu == 5) {
                book.listaLivros();
            } else if (decisaoMenu == 6) {
                book.exibirHistorico();
            }else if (decisaoMenu == 7) {
                book.cadastroUsuario();
            }else if (decisaoMenu == 8) {
                break;
            }else if (decisaoMenu == 9) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
