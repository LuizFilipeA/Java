package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Estagiario extends Funcionario{

    private double salarioBase;

    public Estagiario(String nome, double salarioBase) {
        super(nome);
        if (verificaPositivo(salarioBase)) {
            this.salarioBase = salarioBase;
        }else  {
            throw new IllegalArgumentException("Salario base deve ser positivo");
        }
    }

    @Override
    public double calculaPagamento() {
        return salarioBase;
    }
}
