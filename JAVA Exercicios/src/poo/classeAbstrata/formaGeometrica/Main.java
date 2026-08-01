package poo.classeAbstrata.formaGeometrica;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4);

        formas.add(circulo);
        formas.add(retangulo);
        formas.add(triangulo);

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
