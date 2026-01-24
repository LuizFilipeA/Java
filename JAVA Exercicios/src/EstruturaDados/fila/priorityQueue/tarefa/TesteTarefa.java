package EstruturaDados.fila.priorityQueue.tarefa;

import java.util.PriorityQueue;

public class TesteTarefa {

    public static void main(String[] args) {

        PriorityQueue<Tarefa> filaTarefas = new PriorityQueue<Tarefa>();

        filaTarefas.add(new Tarefa("Beber água", 1));
        filaTarefas.add(new Tarefa("Comer besteira", 5));
        filaTarefas.add(new Tarefa("Praticar exercícios", 2));

        System.out.println(filaTarefas.peek());
    }
}
