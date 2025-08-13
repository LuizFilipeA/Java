package Atividades.BateriaExercicio2.Car.Main;

import Atividades.BateriaExercicio2.Car.Car.Car;

public class Main {
    public static void main(String[] args) {
        Car carro1 = new Car("Modelo","1999", "VK");
        Car carro2 = new Car("Modelo2","2", "Marca");
        System.out.println("Carro 1, ano: "+carro1.getAno());
        System.out.println("Carro 2, ano: "+carro2.getAno());
    }
}
