package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    //Atributos
    long idUsuario=0;
    String nomeUsuario;
    boolean aptoEmprestimo = true;

    //Construtores
    public Usuario(){}
    public Usuario(long idUsuario, long telefone, String nomeUsuario, boolean aptoEmprestimo){}

    //Lista de usuários
    List<Usuario> usuarios = new ArrayList<>();

    //Getters e setters
    public boolean isAptoEmprestimo() {
        return aptoEmprestimo;
    }
    public void setAptoEmprestimo(boolean aptoEmprestimo) {
        this.aptoEmprestimo = aptoEmprestimo;
    }
    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    //imprimir Usuário
    public String imprimir(){
        return this.idUsuario + ", "+this.nomeUsuario+ ", ID "+this.idUsuario;
    }

    //Gerador de ID
    protected long gerarId() {
        this.idUsuario = this.idUsuario + 1;
        return this.idUsuario;
    }

    //Cadastro usuário
    public void cadastro() {
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("Seja bem vindo.\nQual é o seu nome?");
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
            System.out.println("Nome " + usuario.getNomeUsuario() + " ID" + usuario.getIdUsuario() + " Apto para pegar livros emprestado: " + this.aptoEmprestimo);
        }
    }
}
