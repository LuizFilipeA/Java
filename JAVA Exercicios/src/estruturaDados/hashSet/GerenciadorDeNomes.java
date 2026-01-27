package estruturaDados.hashSet;

import java.util.HashSet;

public class GerenciadorDeNomes {

    //o único atributo da nossa classe é a coleção do tipo HashSet, onde iremos armazenar todos os nomes.
    HashSet<String> hashNomes;

    //Construtor
    public GerenciadorDeNomes(){
        this.hashNomes = new HashSet<String>();
    }

    //ADICIONAR NOME - INSERÇÃO
    public String adicionarNome(String nome){
        if (this.hashNomes.add(nome)) { //O metodo add retorna true se o elemento foi adicionado com sucesso e false caso não seja
            return "Nome adicionado com sucesso!";
        } else {
            return "Nome já existe na coleção.";
        }
    }

    //EXISTE NOME? - CONSULTA INDIVIDUAL
    public boolean existeNome(final String nome){
        return this.hashNomes.contains(nome); //O metodo contains retorna true se o elemento existe na coleção e false caso não exista
    }

    //REMOVE
    public String removerNome(final String nome){
        if (this.hashNomes.remove(nome)){ //O metodo remove retorna true se o elemento foi removido com sucesso e false caso não seja
            return "Nome removido com sucesso!";
        } else {
            return "Nome não encontrado.";
        }
    }

    //EXIBIR TODOS OS NOMES - CONSULTA TOTAL
    public void exibirTodosNomes(){
        if (this.hashNomes.isEmpty()){
            System.out.println("Lista vazia. Insira ao menos um nome");
        }else{
            for (String s : hashNomes){
                System.out.println("nome: "+s);
            }
        }

    }
}
