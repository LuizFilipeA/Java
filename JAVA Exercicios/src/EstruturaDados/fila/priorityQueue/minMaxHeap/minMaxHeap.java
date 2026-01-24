package EstruturaDados.fila.priorityQueue.minMaxHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class minMaxHeap {

    public static void main(String[] args) {

        //Por padrão, o PriorityQueue funciona como um minHeap, onde o menor elemento tem a maior prioridade
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(40);
        System.out.println(minHeap.poll()); // 10
        System.out.println(minHeap.poll()); // 20
        System.out.println(minHeap.peek());

        //Diferente do minHeap, o maxHeap recebe Collections.reverseOrder() como parâmetro para inverter a ordem dos elementos
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(-20);
        maxHeap.add(-10);
        maxHeap.add(1);
        maxHeap.add(-30);
        maxHeap.add(-40);

        System.out.println(maxHeap.poll()); // 1
        System.out.println(maxHeap.poll()); // -10
        System.out.println(maxHeap.peek());
    }
}
