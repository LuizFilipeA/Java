package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Gerente extends Funcionario {

    private double bonusGestao;

    public Gerente(String nome, double salarioBase, double bonusGestao) {
        super(nome, "Gerente", salarioBase);
        this.bonusGestao = bonusGestao;
    }

    @Override
    public double calculaPagamento() {
        return (getPagamento() + bonusGestao);
    }
}
