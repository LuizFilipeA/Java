package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Analista extends Funcionario {

    private double salarioBase;
    private double adicional;

    public Analista(String nome, double salarioBase, double adicional) {
        super(nome);
        if (verificaPositivo(salarioBase)) {
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("Salário base deve ser positivo");
        }
        if (verificaPositivo(adicional)) {
            this.adicional = adicional;
        } else {
            throw new IllegalArgumentException("Adicional deve ser positivo");
        }
    }

    @Override
    public double calculaPagamento() {
        return salarioBase+adicional;
    }
}
