package EstruturaDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<Integer> numeros = new LinkedList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);

        System.out.println(numeros.poll());
        System.out.println(numeros.peek()); //"apenas espiando" a head da fila
        System.out.println(numeros.poll());
        System.out.println(numeros.remove());
    }
}
