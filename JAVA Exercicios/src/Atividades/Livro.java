package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
    //Atributos
    long idLivro =0;
    String nomeLivro;
    int quantidade; // Gerenciamento de estoque
    Autor nomeAutor;
    boolean disponivel;
    Usuario ator;

    //Construtor 1
    public Livro(){
        this.nomeAutor = new Autor();
        this.ator = new Usuario();
    }
    //Construtor 2
    public Livro(long idLivro, String nomeLivro, int quantidade, String nomeAutor){
    }

    //Criando Lista de livros chamada "livros"
    List<Livro> livros = new ArrayList<>();
    List historico = new ArrayList<>();

    //Getters e Setters
    public long getIdLivro() {
        return this.idLivro;
    }
    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }
    public List<Livro> getLivros() {
        return this.livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public String getNomeLivro() {
        return this.nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public Autor getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(Autor nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public Usuario getAtor() {
        return ator;
    }
    public void setAtor(Usuario ator) {
        this.ator = ator;
    }

    //imprimir livro
    public String imprimir(){
        return getIdLivro() + ", "+getNomeLivro()+ ", " +getNomeAutor()+", "+getQuantidade();
    }

    //Gerador de ID
    protected long gerarId() {
        this.idLivro = this.idLivro + 1;
        return this.idLivro;
    }

    //Adicionar livro//Devolver
    protected void adicionarLivro() {
        boolean condicao = true;
        System.out.println("**** Adicionar livro **** ");
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();
        Autor autor = new Autor();
        Usuario usuario = new Usuario();
        System.out.println("Digite o nome do livro: ");
        livro.setNomeLivro(sc.nextLine());
        System.out.println("Qual o nome do autor de " +livro.getNomeLivro()+ "?");
        autor.setNomeAutor(sc.nextLine());
        livro.setNomeAutor(autor);
        // Gerenciamento de estoque
        while(condicao) {
            System.out.println("Quantas unidades de " + livro.getNomeLivro() + " do autor: " + autor.getNomeAutor() + " você quer emprestar?");
            livro.setQuantidade(sc.nextInt());
            if(livro.quantidade <= 0){
                System.out.println("Insira um valor válido");
            }else {
                condicao=false;
            }
        }
        livro.setIdLivro(gerarId());
        livro.setDisponivel(true);
        this.livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    //Lista de livros
    public void listaLivros(){
        System.out.println("Livros disponíveis: ");
        for (Livro livro: livros){
            System.out.println("ID "+livro.getIdLivro()+" ,"+livro.getNomeLivro()+" ,"+livro.getNomeAutor().getNomeAutor()+" Quantidade: "+livro.getQuantidade());
        }
    }

    //Remover livro
    protected void removerLivro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o id do livro a ser removido?");
        long idRemove = sc.nextLong();
        for (Livro livro: livros) {
            if (livro.idLivro == idRemove) {
                livros.remove(livro);
                System.out.println("Livro removido com sucesso");
                break;
            } else {
                System.out.println("ID não encontrado");
            }
        }
    }

    //Pegar emprestado
    public void pegarEmprestado(){
        boolean condicao =true;
        while(condicao) {
            Scanner sc = new Scanner(System.in);
            listaLivros();
            System.out.println("Qual o ID do livro que você deseja pegar emprestado?");
            long idEmprestimo = sc.nextLong();
            for (Livro livro : livros) {
                if (livro.idLivro == idEmprestimo) {
                    if(livro.quantidade >= 1){
                        livro.quantidade = livro.quantidade-1;
                        System.out.println("Livro retirado com sucesso!");
                        condicao = false;
                    } else if (livro.quantidade <= 0) {
                        livro.quantidade = 0;
                        System.out.println("Livro indisponível. \nQuantidade insuficiente. ");
                    }
                } else {
                    System.out.println("ID inválido");
                }
            }
        }
    }
}
