package estruturaDados.ex1;

import java.util.HashMap;

public class TesteMap {

    private static final int TAMANHO = 100;

    public static void main(String[] args) {

        HashMap<Integer, Produto> produtos= new HashMap<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < TAMANHO; i++) {
            produtos.put(i, new Produto(i, "Produto " + i, i * 10.0));
            System.out.println("ID: " + produtos.get(i).getId() + ", Nome: " + produtos.get(i).getNome());
        }
        long end = System.currentTimeMillis();
        System.out.printf("Tempo de execucao: %d ms\n", (end - start));
    }
}
