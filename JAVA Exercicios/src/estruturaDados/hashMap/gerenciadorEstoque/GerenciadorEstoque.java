package estruturaDados.hashMap.gerenciadorEstoque;

import java.util.HashMap;

public class GerenciadorEstoque {

    private HashMap<String, Integer> listaEstoque;

    public GerenciadorEstoque(String produto, Integer quantidade){
        this.listaEstoque = new HashMap<>(); // inicializando o HashMap
    }

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

    public String removerProduto(String produto){
        if (listaEstoque.remove(produto) != null) {
            return "Produto " + produto + " removido com sucesso!";
        }else{
            return "Produto não encontrado.";
        }
    }
}
