package Atividades;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaracoes e referencias do menu
        Livro livro = new Livro();
        Autor autor = new Autor();
        Usuario usuario = new Usuario();
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
                livro.adicionarLivro();
            } else if (decisaoMenu == 2) {
                livro.removerLivro();
            } else if (decisaoMenu == 3) {
                livro.pegarEmprestado();
            } else if (decisaoMenu == 4) {
                System.out.println("Devolvendo livro... Função incompleta");
            } else if (decisaoMenu == 5) {
                livro.listaLivros();
            } else if (decisaoMenu == 6) {
                livro.exibirHistorico();
            }else if (decisaoMenu == 7) {
                livro.cadastroUsuario();
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
