package poo.classeAbstrata.formaGeometrica;

public abstract class FormaGeometrica {

    public abstract double calcularArea();

    protected boolean verificarPositivo(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
        return true;
    }

}
