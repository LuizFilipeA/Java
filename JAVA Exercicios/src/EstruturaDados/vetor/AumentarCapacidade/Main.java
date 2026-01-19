package EstruturaDados.vetor.AumentarCapacidade;

public class Main {
    public static void main(String[] args) throws Exception {
        MeuVetor elementos = new MeuVetor(5); // Capacidade inicial de 5 elementos ou seja, o lenght do vetor é sempre 5

        elementos.adicionar("Elemento 1");
        elementos.adicionar("Elemento 2");
        elementos.adicionar("Elemento 3");

    }
}
