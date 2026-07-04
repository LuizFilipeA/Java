package poo.classeAbstrata.formaGeometrica;

public class Retangulo extends FormaGeometrica{

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.nome = "Retangulo";
        this.area = 0;
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = base*altura;
    }
}
