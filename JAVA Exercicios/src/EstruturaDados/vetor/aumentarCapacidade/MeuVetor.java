package EstruturaDados.vetor.aumentarCapacidade;

public class MeuVetor {

    private String[] elementos;
    private int tamanho;

    public MeuVetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(final String elemento) {
        aumentarCapacidade();

        //Como o vetor já foi inicializado, mesmo que nao contenha nenhum elemento inserido, o lenght já foi definido (definimos como 5 na classe main)
        if (tamanho <elementos.length){ //Enquanto o tamanho do vetor for menor que a capacidade, insira o elemento
            elementos[tamanho] = elemento;
            tamanho++;
        }
    }

    public boolean aumentarCapacidade(){
        if(this.tamanho == elementos.length){
            String[] elementosNovos = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++){
                elementosNovos[i] = elementos[i];
                //se adicionarCapacidade funcionar, retorne true
                return true;
            }
            this.elementos = elementosNovos;
        }
        //se não aumentar a capacidade, retorne false
        return false;
    }
}
