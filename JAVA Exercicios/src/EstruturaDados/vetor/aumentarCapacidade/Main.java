package EstruturaDados.vetor.aumentarCapacidade;

public class Main {
    public static void main(String[] args) {

        MeuVetor elementos = new MeuVetor(5); // Capacidade inicial de 5 elementos ou seja, o lenght do vetor inicial é 5
        elementos.adicionar("Elemento 1");
        elementos.adicionar("Elemento 2");
        elementos.adicionar("Elemento 3");
        elementos.adicionar("Elemento 4");
        elementos.adicionar("Elemento 5");
        elementos.adicionar("Elemento 6"); // Sem o aumentar capacidade daria erro, pois o vetor estaria cheio elemento 6 e a capacidade inicial era de 5

    }
}
