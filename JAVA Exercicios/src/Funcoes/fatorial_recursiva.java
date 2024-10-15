/// Meus comentários:
/// Temos passos a seerem seguidos nesse exercício.
/// Lembrando que um número fatorial é o próprio número multiplicado por ele mesmo -1 e assim consecutivamente até dar zero.

/// Passo 1: Crie uma função que sempre retorne um número fatorial n!
/// Passo 2: Coloque a função de exibir na tela do usuário o resultado final
/// Passo 3: Peça que o usuário informe o valor do número fatorial da escolha dele
/// Passo 4: Retorne o valor com a lógica

package Funcoes;
import java.util.Scanner;

public class fatorial_recursiva {

    public static int fatorial (int n){
        System.out.println(n);
        if (n == 0){
            return 1;
        }
        return n*fatorial(n-1);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        int n = leitor.nextInt();
        System.out.println("O número fatorial de "+n+" é: "+fatorial(n));
    }
}

