//Garanta que os livros possam estar associados a autores e que
//os usuários possam pegar emprestado e devolver livros.

package POO.Atividade.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

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
    public void cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        System.out.println("Seja bem vindo Qual é o seu nome?");
        user.setNome(sc.nextLine());
        user.setId(gerarId());
        System.out.println("Digite uma senha forte: ");
        user.setSenha(sc.nextLine());
        System.out.println("Usuário cadastrado com sucesso." + "Nome: " + user.getNome() + " ID:" + user.getId());
        usuarios.add(user);
    }

    //Gerar ID
    protected long gerarId() {
        this.id = this.id + 1;
        return this.id;
    }

    //Exibir usuários
    protected void exibirUsuarios() {
        System.out.println("Lista de usuários:");
        // Para cada usuário da classe Usuario dentro da lista usuarios
        for (Usuario user : usuarios) {
            System.out.println("Nome: " + user.getNome() + "ID:" + user.getId() + " Possui livros a devolver: " + isPegouEmprestado());
        }
    }

    //Verificar id e senha, verificador() retorna um boleano true ou falso, "ID e senha corretos? True" "ID e senha corretos? False"
    public boolean verificadorIdSenha(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu id: ");
            long idtemporario = sc.nextLong();
            System.out.println("Digite sua senha: ");
            String senhatemporaria = sc.next();
            // Verificando se o id e a senha batem na lista de usuários
            for (Usuario user : usuarios) {
                if (idtemporario == user.id) {
                    if (senhatemporaria.equals(user.senha) == true) {
                        System.out.println("As senhas são iguais? "+ senhatemporaria.equals(user.senha));
                        return senhatemporaria.equals(user.senha);
                    }else {
                        System.out.println("ID ou senha inválidos.");
                    }
                } else {
                    System.out.println("ID ou senha inválidos.");
                }
            }
        }
    }

    //Devolver livro
    public void devolverLivro() {
    }
}