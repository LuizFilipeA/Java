package EstruturaDados.vetor.AumentarCapacidade;

public class MeuVetor {

    private String[] elementos;
    private int tamanho;

    public MeuVetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) throws Exception{
        if (tamanho <elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        }
        else {
            throw new Exception("Vetor cheio");
        }
    }
}
