package poo.classes.biblioteca.nova;

public class Livro {

    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean emprestar(){
        if (this.emprestado == true){
            System.out.println("Livro já está emprestado.");
            return true;
        }else{
            System.out.println("Livro emprestado com sucesso.");
            this.emprestado = true;
            return true;
        }
    }

    public void devolver(){
        if (this.emprestado == false){
            System.out.println("Livro já está disponível.");
            return;
        }
        this.emprestado = false;
        System.out.println("Livro devolvido.");
    }

    public String mostrarInformacoes() {
        return "Titulo: " +this.titulo + "\nAutor: " + this.autor + "\nStatus: " + this.emprestado+"\n";
    }
}
