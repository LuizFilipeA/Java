package poo.rh.modelos;

public abstract class Funcionario implements Contratado {

    private final String nome;

    protected boolean verificaPositivo(double valor){
        return valor > 0;
    }

    protected boolean verificaString(String string){
        return string != null && !string.isEmpty();
    }

    public Funcionario(String nome){
        if (verificaString(nome)){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
    }

    public String getNome() {
        return nome;
    }

}
