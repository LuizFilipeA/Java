package poo.classeAbstrata.formaGeometrica;

public abstract class FormaGeometrica {

    protected String nome;
    protected double area;

    public abstract void calcularArea();

    @Override
    public String toString() {
        return "Forma: "+this.nome+"\nArea: "+this.area+"\n";
    }

}
