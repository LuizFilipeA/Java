package Atividades.BateriaExercicio2.Biblioteca.Entidade;

import POO.Biblioteca.User;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(){
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: "+usuario.getNome());
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro: "+livro.getTitulo()+" foi adicionado com sucesso!");
    }

    public Livro buscarLivro(String titulo){
        for (Livro livro: livros){
            if (titulo.equals(livro.getTitulo())){
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(String nome){
        for (Usuario usuario: usuarios){
            if (usuario.getNome().equals(nome)){
                return usuario;
            }
        }
        return null;
    }
}
