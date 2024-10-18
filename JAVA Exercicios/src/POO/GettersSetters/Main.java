package POO.GettersSetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando funcionário 1 e exibindo o metodo ola()
        Funcionario f1 = new Funcionario();
        f1.ola();

        // Coletando dias extras para adiciona-los ao banco de dias
        Scanner sc = new Scanner(System.in);
            System.out.println("Insira os dias extras: ");
            int extra = sc.nextInt();

        // Obtendo get
        f1.getDiastrabalhados();
        // Alterando set
        f1.setDiastrabalhados(extra);
        //Exibindo diastrabalhados atualizado (carga obrigatória + extra)
        f1.getDiastrabalhados();
    }
}
