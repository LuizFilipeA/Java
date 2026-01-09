package EstruturaDados.vetor.AumentarCapacidade;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(final int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho=0;
    }

    public void addElemento(final String elemento){
        if (tamanho<elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        }
    }
}
