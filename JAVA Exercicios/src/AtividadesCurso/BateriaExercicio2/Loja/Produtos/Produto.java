package AtividadesCurso.BateriaExercicio2.Loja.Produtos;

public class Produto {

    //Declarando atributos
    private Integer id;
    private String nome;
    private float preco;
    private int quantidade;

    //Construtor sem argumentos
    public Produto (){
    }

    //Construtor com todos os argumentos
    public Produto(Integer id, String nome, float Preco, int quantidade){
    }

    //Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
