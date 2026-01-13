package EstruturaDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila2 {

    public static void main(String[] args) {

        Queue<String> filaNomes = new LinkedList<>(); //Lista encadeada

        filaNomes.add("Luiz Felipe");
        filaNomes.add("Maria Clara");
        filaNomes.add("João Pedro");
        System.out.println(filaNomes.poll()); // metodo .poll acessa remove o primeiro elemento da fila e quando a fila está vazia retorna null
        System.out.println(filaNomes.peek()); // metodo .peek apenas "espiando" o primeiro elemento da fila
        System.out.println(filaNomes.poll());
        System.out.println(filaNomes.remove()); // metodo .remove recupera e remove o primeiro elemento da fila, porém lança uma exceção se a fila estiver vazia

    }
}
