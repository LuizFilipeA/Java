package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Desenvolvedor extends Funcionario {

    double bonus;

    public Desenvolvedor(String nome, double salarioBase, double bonus) {
        super(nome, "Desenvolvedor", salarioBase);
        if (verificaPositivo(bonus)) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("Bonus deve ser positivo");
        }
    }

    @Override
    public double calculaPagamento() {
        return (getPagamento() + bonus);
    }

    @Override
    public boolean verificaPositivo(double valor) {
        return !(valor <= 0); //Retorna true se o valor for positivo
    }

    public double getBonus() {
        return bonus;
    }
}
