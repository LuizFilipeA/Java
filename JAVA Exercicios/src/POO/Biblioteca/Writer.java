package POO.Biblioteca;

public class Writer {

    //Atributos
    public String nomeAutor;
    //Construtor1
    public Writer(){
    }
    //Construtor2
    public Writer(String nomeAutor){
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
