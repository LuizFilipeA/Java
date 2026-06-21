package nepsAcademy.provaAlternativa.melhoradoIA;

import java.util.Scanner;

//pedi por uma versão mais profissional, eliminamos a existencia do segundo vetor com o metodo charAt() com o numero do indice dentro do parametro
public class VersaoIA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeQuestoes = sc.nextInt();
        String gabarito = sc.next();
        String respostasAluno = sc.next();
        int acertos = 0;

        for (int i = 0; i < quantidadeQuestoes; i++) {
            if (gabarito.charAt(i) == respostasAluno.charAt(i)) {
                acertos++;
            }
        }

        System.out.println(acertos);
        sc.close();
    }

}
