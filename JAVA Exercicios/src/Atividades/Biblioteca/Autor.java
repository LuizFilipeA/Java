package Atividades.Biblioteca;

public class Autor {

    //Atributos
    public String nomeAutor;
    //Construtor1
    public Autor(){
    }
    //Construtor2
    public Autor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }
    //Getters e Setters
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
