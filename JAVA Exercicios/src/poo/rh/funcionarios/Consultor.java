package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class Consultor extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public Consultor(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, "Consultor", valorHora * horasTrabalhadas);
        if (verificaPositivo(valorHora) && verificaPositivo(horasTrabalhadas)) {
            this.valorHora = valorHora;
            this.horasTrabalhadas = horasTrabalhadas;
        }else{
            throw new IllegalArgumentException("Valor hora e horas trabalhadas devem ser positivos");
        }
    }

    @Override
    public double calculaPagamento() {
        return this.valorHora * this.horasTrabalhadas;
    }
}
