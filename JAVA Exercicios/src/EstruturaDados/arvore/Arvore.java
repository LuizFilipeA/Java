package EstruturaDados.arvore;

//Árvore binária é uma estrutura de dados onde cada nó tem no máximo dois filhos, geralmente chamados de filho esquerdo e filho direito.
// Cada nó contém um valor ou dado, e os nós são organizados de forma hierárquica, com um nó raiz no topo.
// A árvore binária é amplamente utilizada em algoritmos de busca, ordenação e representação de expressões matemáticas.
// Cada nó da árvore é representado pela classe "Folha".
// A classe "Arvore" representa a estrutura da árvore binária em si, contendo referências para os nós filhos esquerdo e direito, bem como o nó raiz (folha).
public class Arvore {

    private Folha folha;

    private Arvore esquerda;

    private Arvore direita;

    public Arvore(){
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha){
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty(){
        return this.folha == null;
    }


    //Metodo para inserir uma nova folha na árvore binária, as condicionais fazem este código funcionar como uma árvore binária de busca
    public void inserir(Folha novo){
        //Construção do root/raiz
        if(isEmpty()){
            this.folha = novo;
        }else{
            if(novo.getValor() < this.folha.getValor()){ //Se o valor da nova folha for menor que o valor da folha atual, insira na esquerda
                if(this.esquerda == null){ //Se não existir uma árvore na esquerda
                    this.esquerda = new Arvore(novo); //Cria uma nova árvore na esquerda com a nova folha
                }else{ //Se já existir uma árvore na esquerda
                    this.esquerda.inserir(novo); //Chama o metodo inserir recursivamente na subárvore esquerda
                }
            }else{ //Se o valor da nova folha for maior ou igual ao valor da folha atual, insira na direita
                if(this.direita == null){ //Se não existir uma árvore na direita
                    this.direita = new Arvore(novo); //Cria uma nova árvore na direita com a nova folha
                }else{ //Se já existir uma árvore na direita
                    this.direita.inserir(novo); //Chama o metodo inserir recursivamente na subárvore direita
                }
            }
        }
    }
}
