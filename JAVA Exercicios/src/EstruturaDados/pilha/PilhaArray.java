package EstruturaDados.pilha;

//Em programação, uma pilha segue a lógica LIFO (Last In, First Out), ou seja, o último elemento a entrar é o primeiro a sair (como uma pilha de pratos).

public class PilhaArray {

    private int[] dados;
    private int topo; // É uma variável de controle. Ela indica a posição (o índice) onde o último elemento foi colocado.

    public PilhaArray(int capacidade){
        this.dados = new int[capacidade];
        this.topo = -1; //Começa em -1 porque, inicialmente, não há nenhum elemento (o índice 0 seria o primeiro elemento), ou seja, garante que a pilha inicie vazia

    }

    public void push(int valor) { // Adiciona um elemento no topo da pilha
        if(topo == dados.length -1){ // dados.length -1 representa o índice do último elemento do array
            throw new RuntimeException("Overflow: Pilha cheia");
        }
        dados[++topo] = valor; // Incrementa o topo e adiciona o valor
    }
}
