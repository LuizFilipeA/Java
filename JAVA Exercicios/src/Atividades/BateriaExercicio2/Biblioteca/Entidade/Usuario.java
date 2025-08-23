package Atividades.BateriaExercicio2.Biblioteca.Entidade;

public class Usuario {
    String nome;
    Livro livroemprestado = null;

    public Usuario(String nome){
        this.nome = nome;
    }

    public Livro getLivroemprestado() {
        return livroemprestado;
    }

    public void setLivroemprestado(Livro livroemprestado) {
        this.livroemprestado = livroemprestado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void alugarLivro(Livro livroemprestado){
        if (livroemprestado.isDisponivel()){
            System.out.println("Você alugou o livro "+livroemprestado.getTitulo());
            livroemprestado.setDisponivel(false);
        }
        else {
            System.out.println("Devolva um livro para pegar outro emprestado");
        }
    }

    public void devolverLivro(Livro livroemprestado){
        if (!livroemprestado.isDisponivel()){ // ! se for DIFERENTE de true, if it is false
            System.out.println("Você devolveu o livro "+livroemprestado.getTitulo());
            livroemprestado.setDisponivel(true);
        }
    }


}
