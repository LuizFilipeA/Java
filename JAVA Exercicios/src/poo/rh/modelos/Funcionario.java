package poo.rh.modelos;

public abstract class Funcionario implements Contratado {

    private String nome;
    private String cargo;
    private double salarioBase;

    public Funcionario(String nome, String cargo, double salarioBase){

        if (verificaPositivo(salarioBase)) {
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("Salário base deve ser positivo");
        }if (nome != null && !nome.isEmpty() && cargo != null && !cargo.isEmpty()){
            this.nome = nome;
            this.cargo = cargo;
        }

        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getPagamento() {
        return salarioBase;
    }

    @Override
    public boolean verificaPositivo(double valor) {
      return !(valor <=0);
    }
}
