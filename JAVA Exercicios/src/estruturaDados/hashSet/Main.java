package estruturaDados.hashSet;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GerenciadorDeNomes gerenciadorNomes = new GerenciadorDeNomes();
        int opt = 5;

        do{
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar nome\n" +
                    "2 - Verificar se o nome existe\n" +
                    "3 - Remover nome\n" +
                    "4 - Exibir todos os nomes\n" +
                    "5 - Sair"));

            switch (opt){
                case 1:{
                    System.out.println(gerenciadorNomes.adicionarNome(JOptionPane.showInputDialog("Digite o nome a ser adicionado: ")));
                    break;
                }

                case 2:{
                    System.out.println(gerenciadorNomes.existeNome(JOptionPane.showInputDialog("Digite o nome a ser verificado: ")));
                    break;
                }

                case 3:{
                    System.out.println(gerenciadorNomes.removerNome(JOptionPane.showInputDialog("Digite o nome a ser removido: ")));
                    break;
                }

                case 4:{
                    gerenciadorNomes.exibirTodosNomes();
                    break;
                }

                default: {
                    System.out.println("Opção inválida! Tente um número entre 1 e 5.");
                    break;
                }
            }
        }
        while (opt != 5);
    }
}
