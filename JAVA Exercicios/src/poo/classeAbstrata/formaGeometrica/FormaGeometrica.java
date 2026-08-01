package poo.classeAbstrata.formaGeometrica;

public abstract class FormaGeometrica {

    private String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public abstract double calcularArea();

    protected boolean verificarPositivo(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        return true;
    }

}
