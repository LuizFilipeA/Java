package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Desenvolvedor extends Funcionario {

    private double salarioBase;
    private double bonus;

    public Desenvolvedor(String nome, double salarioBase, double bonus) {
        super(nome);
        if (verificaPositivo(salarioBase)) {
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("Salario base deve ser positivo");
        }
        if (verificaPositivo(bonus)) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("Bonus deve ser positivo");
        }
    }

    @Override
    public double calculaPagamento() {
        return (salarioBase + bonus);
    }
}
