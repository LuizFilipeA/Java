package nepsAcademy;

//P1 * C1 = P2 * C2;
// A primeira e única linha da entrada contém 4 inteiros, P1, C1, P2 e C2, nesta ordem.
//onde P1 e P2 são os pesos da criança no lado esquerdo e direito, respectivamente, e C1 C2 são os comprimentos da gangorra do lado esquerdo e direito, respectivamente.
        /*Seu programa deve produzir uma única linha, contendo um único inteiro. Se a gangorra estiver equilibrada,
        imprima '0'. Se ela estiver desequilibrada de modo que a criança esquerda esteja na parte de baixo,
        imprima '-1', senão, imprima '1'. ṕessoa esquerda p1 c1*/


import java.util.Scanner;

public class Gangorra {

    public static void calcularEquilibrio(int p1, int c1, int p2, int c2) {

        int ladoEsquerdo = p1 * c1;
        int ladoDireito = p2 * c2;
        if (ladoEsquerdo == ladoDireito) {
            System.out.println(0); // Equilibrada
        } else if (ladoEsquerdo > ladoDireito) {
            System.out.println(-1); // Criança esquerda na parte de baixo
        } else {
            System.out.println(1);// Criança direita na parte de baixo
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int c1 = sc.nextInt();
        int p2 = sc.nextInt();
        int c2 = sc.nextInt();

        calcularEquilibrio(p1, c1, p2, c2);
        sc.close();
   }
}
