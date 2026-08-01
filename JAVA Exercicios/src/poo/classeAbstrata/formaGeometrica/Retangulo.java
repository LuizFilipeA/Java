package poo.classeAbstrata.formaGeometrica;

public class Retangulo extends FormaGeometrica{

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if (verificarPositivo(base) && verificarPositivo(altura)) {
            this.base = base;
            this.altura = altura;
        }
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
