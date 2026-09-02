package estruturaDados.ex1;

public class TesteArray {

    public static final int TAMANHO = 100;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Produto[] produtos = new Produto[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            produtos[i] = new Produto(i, "Produto " + i, i * 10.0);
            System.out.println("ID: " + produtos[i].getId() + ", Nome: " + produtos[i].getNome());
        }
        long end = System.currentTimeMillis();
        System.out.printf("Tempo de execução: %d ms\n", (end - start));
    }
}
