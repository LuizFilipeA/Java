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

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro: "+livro.getTitulo()+" foi adicionado com sucesso!");
    }

    public void buscarLivro(String titulo){
        for (Livro livro: livros){
            if (titulo.equals(livro.getTitulo())){
                System.out.println("Livro: "+livro.getTitulo()+" Autor: "+livro.getAutor());
            }
        }
    }

    public void buscarUsuario(Usuario usuario){
        for (Usuario user: usuarios){
            if (user==usuario){
                System.out.println("Usuario: "+usuario.getNome()+" Livro emprestado: "+usuario.getLivroemprestado());
            }
        }
    }

}
