package AtividadesCurso.BateriaExercicio2.Biblioteca.Entidade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        //"Menu"
        while (true){
            System.out.println("1 - Alugar livro");
            System.out.println("2 - Devolver livro");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir nova linha

            if (opcao == 1){
                System.out.println("Digite o nome do usuário: ");
                String nomeUsuario = sc.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);
                if (nomeUsuario != null){
                    System.out.println("Digite o título do livro: ");
                    String tituloLivro = sc.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloLivro);

                    if (livro != null){
                        usuario.alugarLivro(livro);
                    }else{
                        System.out.println("Livro não encontrado");
                    }
                }else {
                    System.out.println("Usuário não encontrado");
                }
            } else if (opcao == 2) {
                System.out.println("Aqui vem a lógica");
            }
        }
    }
}
