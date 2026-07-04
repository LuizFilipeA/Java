package poo.classeAbstrata.formaGeometrica;

public class Triangulo extends FormaGeometrica{

    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.nome = "Triangulo";
        this.area = 0;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        this.area = base*altura/2;
    }
}
