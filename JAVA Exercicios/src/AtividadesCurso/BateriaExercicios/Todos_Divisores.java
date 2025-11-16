// Dado um número inteiro x (SCANNER) encontre todos os divisores desse número
// Entrada = Apenas 1 scanner pra coletar o x
// A saída do seu programa deve conter apenas uma linha com os divisores de
// 2≤X≤1000000000
package AtividadesCurso.BateriaExercicios;
import java.util.Scanner;
public class Todos_Divisores {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for (int i=1;i<=100000000;i++){
            if (n% i == 0){
                System.out.print(i+ " ");
            }
        }
    }
}