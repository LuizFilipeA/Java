package Atividades.BateriaExercicio2.Biblioteca.Entidade;

import POO.Biblioteca.Livro;
import POO.Biblioteca.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

Scanner

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
    }

    public void buscarLivro(String nome){
        for ()
    }

    public void buscarUsuario(Usuario usuario){
        if (usuario.getNomeUsuario().equals())
    }

}
