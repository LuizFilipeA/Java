package poo.rh;

import poo.rh.funcionarios.*;
import poo.rh.modelos.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        double folhaSalarial = 0;
        double menorSalario = 0;
        double maiorSalario = 0;

        funcionarios.add(new Consultor("Carlos", 100, 20));
        funcionarios.add(new Desenvolvedor("João", 5000, 1000));
        funcionarios.add(new Estagiario("Maria", 2000));
        funcionarios.add(new FreeLancer("Pedro", 200, 40));
        funcionarios.add(new Gerente("Andressa", 10000, 2000));
        funcionarios.add(new Analista("Lucas", 4000, 500));

        for (Funcionario funcionario : funcionarios) {
            double pagamento = funcionario.calculaPagamento();
            System.out.println("Nome: " + funcionario.getNome() +", Salário: " + pagamento);
               folhaSalarial += pagamento;
            if(pagamento < menorSalario || menorSalario == 0){
                menorSalario = pagamento;
            }
            if(pagamento > maiorSalario){
                maiorSalario = pagamento;
            }
        }
        double salarioMedio = folhaSalarial / funcionarios.size();

        System.out.printf("Folha salarial: %.2f\nMedia salarial: %.2f\nMenor salário: %.2f\nMaior salário: %.2f\n", folhaSalarial, salarioMedio, menorSalario, maiorSalario);
    }
}
