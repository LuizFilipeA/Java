package POO.Atividade.Biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro{
    //Atributos
    protected String nomeLivro;
    protected String nomeAutor;
    protected int quantidade;
    protected long id =0;


    //Lista utilizada pra armazenar os livros
    public List<Livro> livros = new ArrayList<>();


    //Gerador de ID
    protected long gerarId(){
        this.id = this.id +1;
        return this.id;
    }


    //Setters
    protected void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    protected void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    protected void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    protected void setId(long id) {
        this.id = id;
    }


    // Getters
    public String getNomeLivro() {
        return this.nomeLivro;
    }
    public String getNomeAutor() {
        return this.nomeAutor;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public long getId() {
        return this.id;
    }

    //Adicionar livro
    protected void adicionarLivro() {
        Scanner sc = new Scanner(System.in);
        Livro atual = new Livro();
        System.out.println("Digite o nome do livro: ");
        atual.setNomeLivro(sc.nextLine());
        System.out.println("Qual o nome do autor de " + atual.getNomeLivro() + "?");
        atual.setNomeAutor(sc.nextLine());
        System.out.println("Quantas unidades de " + atual.getNomeLivro() + " você quer doar?");
        atual.setQuantidade(sc.nextInt());
        atual.setId(gerarId());
        System.out.println("Livro adicionado com sucesso!");
        this.livros.add(atual);
    }


    //Exibir livros
    protected void exibirLivros() {
        System.out.println("Livros disponíveis: ");
        // Para cada "livro" da classe "Livro" dentro da lista de "livros"
        for (Livro livro: livros){
            System.out.println("ID:"+livro.getId()+" Livro:" +livro.getNomeLivro()+ " Autor:" + livro.getNomeAutor() + " Qntd.Disponível:" + livro.getQuantidade());
        }
    }


    //Remover livro
    protected void removerLivro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o id do livro a ser removido?");
        long id = sc.nextLong();
        for (Livro livro: livros){
            if (livro.id == id){
                livros.remove(livro);
                System.out.println("Livro removido com sucesso");
                break;
            }else{
                System.out.println("ID não encontrado");;
            }
        }
    }

}
