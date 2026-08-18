package poo.rh;

import poo.rh.funcionarios.Desenvolvedor;
import poo.rh.funcionarios.Estagiario;
import poo.rh.funcionarios.FreeLancer;
import poo.rh.funcionarios.Gerente;
import poo.rh.modelos.Funcionario;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double folhaSalarial = 0;
        double salarioMedio = 0;
        double menorSalario = 0;
        double maiorSalario = 0;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 5000, 1000);
        Estagiario estagiario = new Estagiario("Maria", 2000);
        Gerente gerente = new Gerente("Andressa", 10000, 2000);
        FreeLancer freeLancer = new FreeLancer("Carlos", 300, 40);

        funcionarios.add(desenvolvedor);
        funcionarios.add(estagiario);
        funcionarios.add(gerente);
        funcionarios.add(freeLancer);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo() + ", Salário: " + funcionario.calculaPagamento());
               folhaSalarial += funcionario.calculaPagamento();
            if(funcionario.calculaPagamento() < menorSalario || menorSalario == 0){
                menorSalario = funcionario.calculaPagamento();
            }
            if(funcionario.calculaPagamento() > maiorSalario){
                maiorSalario = funcionario.calculaPagamento();
            }
        }
        salarioMedio = folhaSalarial / funcionarios.size();

        System.out.printf("Folha salarial: %.2f\nMedia salarial: %.2f\nMenor salário: %.2f\nMaior salário: %.2f\n", folhaSalarial, salarioMedio, menorSalario, maiorSalario);
    }
}
