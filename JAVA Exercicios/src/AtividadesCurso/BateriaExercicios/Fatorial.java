package AtividadesCurso.BateriaExercicios;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fatorial = 1;
        for (int i =1; i <= n; i++){
            System.out.println(fatorial);
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }
        System.out.println(fatorial);
    }
}
