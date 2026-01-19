package EstruturaDados.vetor.AumentarCapacidade;

public class MeuVetor {

    private String[] elementos;
    private int tamanho;

    public MeuVetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(final String elemento) throws Exception{

        //Como o vetor já foi inicializado, mesmo que nao contenha nenhum elemento inserido, o lenght já foi definido (definimos como 5 na classe main)
        if (tamanho <elementos.length){ //Enquanto o tamanho do vetor for menor que a capacidade, insira o elemento
            System.out.println(elementos.length);
            elementos[tamanho] = elemento;
            tamanho++;
        }
        else {
            throw new Exception("Vetor cheio");
        }
    }
}
