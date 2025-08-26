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
            livroemprestado.setDisponivel(false);
            System.out.println(nome+"Você alugou o livro "+livroemprestado.getTitulo());
        }
        else {
            System.out.println(livroemprestado.getTitulo()+" não está disponível");
        }
    }

    public void devolverLivro(){
        if (!livroemprestado.isDisponivel()){ // ! se for DIFERENTE de true, if it is false
            livroemprestado.setDisponivel(true);
            System.out.println("Você devolveu o livro "+livroemprestado.getTitulo());
        }else{
            System.out.println("Não há nenhum livro para devolver");
        }
    }


}
