//Garanta que os livros possam estar associados a autores e que
//os usuários possam pegar emprestado e devolver livros.

package POO.Atividade.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario extends Livro{

    //Atributos
    long id = 0;
    String nome;
    String senha;
    boolean pegouEmprestado = false;

    //Lista para armazenar os dados dos usuários
    List<Usuario> usuarios = new ArrayList<>();

    //Getters
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public boolean isPegouEmprestado() {
        return pegouEmprestado;
    }
    public String getSenha() {
        return senha;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPegouEmprestado(boolean pegouEmprestado) {
        this.pegouEmprestado = pegouEmprestado;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Cadastro usuário
    public void cadastrarUsuario(){
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        System.out.println("Seja bem vindo Qual é o seu nome?");
        user.setNome(sc.nextLine());
        user.setId(gerarId());
        System.out.println("Digite sua senha: ");
        user.setSenha(sc.nextLine());
        System.out.println("Usuário cadastrado com sucesso.");
        System.out.println("Olá, "+user.getNome()+" ID:"+user.getId());
        usuarios.add(user);
    }

    //Gerar ID
    protected long gerarId(){
        this.id = this.id +1;
        return this.id;
    }

    //Exibir usuários
    public void exibirUsuarios(){
        System.out.println("Lista de usuários:");
        // Para cada usuário da classe Usuario dentro da lista usuarios
        for(Usuario user: usuarios){
            System.out.println("Nome: "+user.getNome()+"ID:"+user.getId()+" Possui livros a devolver: "+isPegouEmprestado());
        }
    }

    //Pegar livro emprestado
    public void pegarEmprestado(){
        Livro book = new Livro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Empréstimo de livro");
        System.out.println("Digite seu id: ");
        long idUser = sc.nextLong();
        System.out.println("Digite sua senha: ");
        String senhaUser = sc.nextLine();
        for (Usuario user: usuarios){
            if (user.id == idUser || user.senha == senhaUser){
                book.exibirLivros();
                System.out.println("O usuário pode pegar emprestado apenas um livro por vez.");
                System.out.println("Qual o id do livro que você deseja retirar?");
                long idDigitado = sc.nextLong();
                for (Livro livro: livros){
                    if (livro.id == idDigitado){
                        if(livro.quantidade >= 1){
                            livro.setQuantidade(quantidade-1);
                            setPegouEmprestado(true);
                        }else if(livro.quantidade <= 0){
                            System.out.println("Lamento, livro indisponível");
                        }
                    }
                }
            }
        }

    }

    //Devolver livro
    public void devolverLivro(){

    }

}
