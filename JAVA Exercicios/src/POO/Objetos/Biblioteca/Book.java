package POO.Objetos.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    //Atributos
    long idLivro =0;
    String nomeLivro;
    int quantidade; // Gerenciamento de estoque
    Writer nomeWriter;
    boolean disponivel;
    User User;

    //Construtor
    public Book(){
        this.nomeWriter = new Writer();
        this.User = new User();
    }

    //Criando Lista de livros chamada "livros" adicionados
    List<Book> books = new ArrayList<>();

    //Criando Lista de livros que cada usuário pegou emprestado
    List<Book> livrosEmprestado = new ArrayList<>();

    //Getters e Setters
    public long getIdLivro() {
        return this.idLivro;
    }
    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }
    public List<Book> getLivros() {
        return this.books;
    }
    public void setLivros(List<Book> books) {
        this.books = books;
    }
    public String getNomeLivro() {
        return this.nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public Writer getNomeAutor() {
        return nomeWriter;
    }
    public void setNomeAutor(Writer nomeWriter) {
        this.nomeWriter = nomeWriter;
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
    public User getUsuario() {
        return User;
    }
    public void setUsuario(User user) {
        User = user;
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
        Book book = new Book();
        Writer writer = new Writer();
        User user = new User();
        while (true){
            System.out.println("Novo usuário? Já possui conta? [S/N] ");
            char validacao = entradaChar.next().charAt(0);
            if (validacao == 'S'){
                book.setUsuario(user);
                break;
            } else if (validacao == 'N') {
                System.out.println("Qual é o seu nome?");
                user.setNomeUsuario(sc.nextLine());
                user.setIdUsuario(gerarId());
                System.out.println("Nome: " + user.getNomeUsuario() + " ID:" + user.getIdUsuario());
                users.add(user);
                book.setUsuario(user);
                break;
            }
        }
        System.out.println("Digite o nome do livro: ");
        book.setNomeLivro(sc.nextLine());
        System.out.println("Qual o nome do autor de " + book.getNomeLivro()+ "?");
        writer.setNomeAutor(sc.nextLine());
        book.setNomeAutor(writer);
        book.setQuantidade(1);
        book.setIdLivro(gerarId());
        book.setDisponivel(true);
        this.books.add(book);
        System.out.println("Livro adicionado com sucesso!");
    }

    //Remover livro
    protected void removerLivro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o id do livro a ser removido?");
        long idRemove = sc.nextLong();
        for (Book book : books) {
            if (book.idLivro == idRemove) {
                books.remove(book);
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
            for (Book book : books) {
                if (book.idLivro == idEmprestimo) {
                    if(book.quantidade == 1){
                        book.quantidade = -1;
                        livrosEmprestado.add(book);
                        System.out.println("Livro retirado com sucesso!");
                        condicao = false;
                    } else if (book.quantidade <= 0) {
                        book.quantidade = 0;
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
        for (Book book : books){
            System.out.println("ID "+ book.getIdLivro()+" ,"+ book.getNomeLivro()+" ,"+ book.getNomeAutor().getNomeAutor()+" Quantidade: "+ book.getQuantidade());
        }
    }

    //Devolver livro

    //Exibir histórico
    public void exibirHistorico(){
        System.out.println("Histórico da biblioteca: ");
        for (Book book : books){
            System.out.println("ID "+ book.getIdLivro()+" ,"+ book.getNomeLivro()+" ,"+ book.getNomeAutor().getNomeAutor()+" Quantidade: "+ book.getQuantidade() +" Gerado pelo ID: "+ book.getUsuario().getIdUsuario()+" ,"+ book.getUsuario().getNomeUsuario());
        }
    }


    // Usuário
    //Lista de todos usuários
    List<User> users = new ArrayList<>();

    //Cadastro usuário
    public void cadastroUsuario() {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Seja bem vindo a biblioteca!");
        System.out.println("Qual é o seu nome?");
        user.setNomeUsuario(sc.nextLine());
        //Cadastrando ID
        user.setIdUsuario(gerarId());
        System.out.println("Usuário cadastrado com sucesso." + "Nome: " + user.getNomeUsuario() + " ID:" + user.getIdUsuario());
        users.add(user);
    }

    //Exibir usuários
    protected void listaUsuarios(){
        System.out.println("Lista de usuários:");
        // Para cada usuário da classe Usuario dentro da lista usuarios
        for (User user : users) {
            System.out.println("Nome " + user.getNomeUsuario() + " ID" + user.getIdUsuario());
        }
    }
}
