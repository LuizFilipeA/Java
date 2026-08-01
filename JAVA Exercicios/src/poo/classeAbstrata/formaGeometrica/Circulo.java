package poo.classeAbstrata.formaGeometrica;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        if (verificarPositivo(raio)) {
            this.raio = raio;
        }
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
