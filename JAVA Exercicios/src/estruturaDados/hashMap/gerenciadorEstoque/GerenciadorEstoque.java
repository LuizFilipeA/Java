package estruturaDados.hashMap.gerenciadorEstoque;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorEstoque {

    //ATRIBUTO, a própria estrutura de dados HashMap chamada listaEstoque
    private HashMap<String, Integer> listaEstoque;

    //CONSTRUTOR - Note que mesmo recebendo por parametros, nós não adicionamos nenhum produto ou quantidade aqui. Apenas inicializamos o HashMap.
    public GerenciadorEstoque(String produto, Integer quantidade){
        this.listaEstoque = new HashMap<>(); // inicializando o HashMap
    }

    //ADICIONAR OU ATUALIZAR PRODUTO
    public String adicionarOuAtualizar(String produto, final Integer quantidade){
        if (quantidade <= 0){
            return "Quantidade inválida! Insira um valor positivo";
        }

        //Se o produto já existir dentro do nosso estoque, sobrescrevemos o produto e atualizamos a quantidade
        if (listaEstoque.containsKey(produto)){
            listaEstoque.put(produto, listaEstoque.get(produto) +quantidade); // no metodo listaEstoque.get(produto) mesmo inserindo uma "chave", o que ela retorna é o valor correspondente aquela chave.
            return "Produto " +produto+" atualizado com sucesso! Quantidade atual: " +listaEstoque.get(produto);
        }else {
            listaEstoque.put(produto, quantidade);
            return "Produto "+produto+" adicionado com sucesso!";
        }
    }

    //REMOVER PRODUTO
    public String removerProduto(final String produto){
        if (listaEstoque.remove(produto) != null) {
            return "Produto " + produto + " removido com sucesso!";
        }else{
            return "Produto não encontrado.";
        }
    }

    //EXIBIR TODOS OS PRODUTOS
    public void exibirTodosProdutos(){
        for (Map.Entry<String, Integer> entry : listaEstoque.entrySet()){
            System.out.println("Produto: " +entry.getKey()+ " | Quantidade: " +entry.getValue());
        }
    }

    //CONSULTA POR PRODUTO
    public void consultarProduto(final String produto){
        if (listaEstoque.containsKey(produto)){
            System.out.println("Produto: " +produto+ " | Quantidade: " +listaEstoque.get(produto));
        }else{
            System.out.println("Produto não encontrado.");
        }
    }


}
