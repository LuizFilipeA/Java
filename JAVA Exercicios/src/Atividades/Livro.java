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
    Usuario Usuario;

    //Construtor
    public Livro(){
        this.nomeAutor = new Autor();
        this.Usuario = new Usuario();
    }

    //Criando Lista de livros chamada "livros" adicionados
    List<Livro> livros = new ArrayList<>();

    //Criando Lista de livros que cada usuário pegou emprestado
    List<Livro> livrosEmprestado = new ArrayList<>();

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
    public Atividades.Usuario getUsuario() {
        return Usuario;
    }
    public void setUsuario(Atividades.Usuario usuario) {
        Usuario = usuario;
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

    //Adicionar livro
    protected void adicionarLivro() {
        System.out.println("**** Adicionar livro **** ");
        Scanner sc = new Scanner(System.in);
        Scanner entradaChar = new Scanner(System.in);
        Livro livro = new Livro();
        Autor autor = new Autor();
        Usuario usuario = new Usuario();
        while (true){
            System.out.println("Novo usuário? Já possui conta? [S/N] ");
            char validacao = entradaChar.next().charAt(0);
            if (validacao == 'S'){
                livro.setUsuario(usuario);
                break;
            } else if (validacao == 'N') {
                System.out.println("Qual é o seu nome?");
                usuario.setNomeUsuario(sc.nextLine());
                usuario.setIdUsuario(gerarId());
                System.out.println("Nome: " + usuario.getNomeUsuario() + " ID:" + usuario.getIdUsuario());
                usuarios.add(usuario);
                livro.setUsuario(usuario);
                break;
            }
        }
        System.out.println("Digite o nome do livro: ");
        livro.setNomeLivro(sc.nextLine());
        System.out.println("Qual o nome do autor de " +livro.getNomeLivro()+ "?");
        autor.setNomeAutor(sc.nextLine());
        livro.setNomeAutor(autor);
        livro.setQuantidade(1);
        livro.setIdLivro(gerarId());
        livro.setDisponivel(true);
        this.livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
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
                    if(livro.quantidade == 1){
                        livro.quantidade = -1;
                        livrosEmprestado.add(livro);
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

    //Lista de livros
    public void listaLivros(){
        System.out.println("Livros disponíveis: ");
        for (Livro livro: livros){
            System.out.println("ID "+livro.getIdLivro()+" ,"+livro.getNomeLivro()+" ,"+livro.getNomeAutor().getNomeAutor()+" Quantidade: "+livro.getQuantidade());
        }
    }

    //Devolver livro

    //Exibir histórico
    public void exibirHistorico(){
        System.out.println("Histórico da biblioteca: ");
        for (Livro livro: livros){
            System.out.println("ID "+livro.getIdLivro()+" ,"+livro.getNomeLivro()+" ,"+livro.getNomeAutor().getNomeAutor()+" Quantidade: "+livro.getQuantidade() +" Gerado pelo ID: "+livro.getUsuario().getIdUsuario()+" ,"+livro.getUsuario().getNomeUsuario());
        }
    }


    // Usuário
    //Lista de todos usuários
    List<Usuario> usuarios = new ArrayList<>();

    //Cadastro usuário
    public void cadastroUsuario() {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("Seja bem vindo a biblioteca!");
        System.out.println("Qual é o seu nome?");
        usuario.setNomeUsuario(sc.nextLine());
        //Cadastrando ID
        usuario.setIdUsuario(gerarId());
        System.out.println("Usuário cadastrado com sucesso." + "Nome: " + usuario.getNomeUsuario() + " ID:" + usuario.getIdUsuario());
        usuarios.add(usuario);
    }

    //Exibir usuários
    protected void listaUsuarios(){
        System.out.println("Lista de usuários:");
        // Para cada usuário da classe Usuario dentro da lista usuarios
        for (Usuario usuario : usuarios) {
            System.out.println("Nome " + usuario.getNomeUsuario() + " ID" + usuario.getIdUsuario());
        }
    }
}
