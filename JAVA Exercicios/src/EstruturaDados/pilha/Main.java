package EstruturaDados.pilha;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> fila= new LinkedList<>();
        fila.offer("Elemento 1"); //Primeiro a entrar na fila e também o primeiro a sair da fila
        fila.offer("Elemento 2");
        fila.offer("Elemento 3");
        System.out.println(fila.poll()); //Remove e retorna o primeiro elemento da fila (Elemento 1)
    }
}
