package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class FreeLancer extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public FreeLancer(String nome, double valorHora, double horasTrabalhadas) {
        super(nome, "FreeLancer", valorHora*horasTrabalhadas);
        if (verificaPositivo(valorHora) && verificaPositivo(horasTrabalhadas)) {
            this.valorHora = valorHora;
            this.horasTrabalhadas = horasTrabalhadas;
        } else {
            throw new IllegalArgumentException("Valor hora e horas trabalhadas devem ser positivos");
        }
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
