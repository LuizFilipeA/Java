package poo.rh.modelos;

public abstract class Funcionario implements Contratado {

    private String nome;
    private String cargo;
    private double pagamento;

    public Funcionario(String nome, String cargo, double pagamento){
        this.nome = nome;
        this.cargo = cargo;
        this.pagamento = pagamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public boolean verificaPositivo(double valor) {
        if (valor <= 0){
            return false;
        }
        return true;
    }
}
