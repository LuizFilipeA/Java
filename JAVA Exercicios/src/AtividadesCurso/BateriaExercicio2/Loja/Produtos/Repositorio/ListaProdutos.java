package AtividadesCurso.BateriaExercicio2.Loja.Produtos.Repositorio;

import AtividadesCurso.BateriaExercicio2.Loja.Produtos.Produto;

import java.util.HashSet;
import java.util.Set;

public class ListaProdutos {

    //Escolhi a collection set, pois nesse caso a ordem armazenada nao importa tanto, e sim a quantidade disponivel
    Set<Produto> produtos = new HashSet<>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }


    public void removerProduto(Integer id){
        /
        produtos.removeIf(produto -> id.equals(produto.getId()));
    }
}
