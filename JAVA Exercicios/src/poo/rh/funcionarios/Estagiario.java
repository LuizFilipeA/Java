package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salarioBase) {
        super(nome, "Estagiario", salarioBase);
    }

    @Override
    public double calculaPagamento() {
        return getPagamento();
    }
}
