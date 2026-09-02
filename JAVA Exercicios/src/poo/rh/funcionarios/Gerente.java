package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Gerente extends Funcionario {

    private double bonusGestao;
    private double salarioBase;

    public Gerente(String nome, double salarioBase, double bonusGestao) {
        super(nome);
        if (verificaPositivo(salarioBase)){
            this.salarioBase = salarioBase;
        }else {
            throw new IllegalArgumentException("Salário base deve ser positivo");
        }
        if (verificaPositivo(bonusGestao)){
            this.bonusGestao = bonusGestao;
        }else {
            throw new IllegalArgumentException("Bonus de gestão deve ser positivo");
        }
    }

    @Override
    public double calculaPagamento() {
        return (salarioBase + bonusGestao);
    }
}
