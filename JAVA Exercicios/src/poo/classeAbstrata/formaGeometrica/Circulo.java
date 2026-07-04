package poo.classeAbstrata.formaGeometrica;

public class Circulo extends FormaGeometrica{

    double raio;

    public Circulo(double raio) {
        this.nome = "Circulo";
        this.area = 0;
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        this.area = Math.PI*Math.pow(this.raio, 2);
    }


}
