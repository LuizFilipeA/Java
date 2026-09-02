package poo.rh.funcionarios;

import poo.rh.modelos.Funcionario;

public class FreeLancer extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public FreeLancer(String nome, double valorHora, double horasTrabalhadas) {
        super(nome);
        if (verificaPositivo(valorHora)) {
            this.valorHora = valorHora;
        }else {
            throw new IllegalArgumentException("Valor da hora deve ser positivo");
        }
        if (verificaPositivo(horasTrabalhadas)) {
            this.horasTrabalhadas = horasTrabalhadas;
        }else {
            throw new IllegalArgumentException("Horas trabalhadas deve ser positivo");
        }
    }

    @Override
    public double calculaPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
