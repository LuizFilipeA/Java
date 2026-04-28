package fundamentos.streams;

/*Exercício 2: O Agrupador (Mais Difícil)

Imagine que você tem uma classe Produto com os atributos: String nome, String categoria e double preco. Você tem uma lista cheia desses produtos.

O que fazer: Use Streams para:

    Filtrar apenas os produtos que custam mais de R$ 50,00.

    Agrupar esses produtos por categoria. O resultado final deve ser salvo em um Map<String, List<Produto>>.

    💡 Dica de ouro: Para a operação terminal, você precisará usar .collect(Collectors.groupingBy(...)). Vale a pena dar uma pesquisada nesse carinha!*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4 {

    private String nome;
    private String categoria;
    private double preco;

    @Override
    public String toString() {
        return "Ex4{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public Ex4(String nome, String categoria, double preco){
        this.nome=nome;
        this.categoria = categoria;
        this.preco = preco;


    }

    public static void main(String[] args) {

        Ex4 produto1 = new Ex4("Pizza", "Fast food", 51);
        Ex4 produto2 = new Ex4("Refrigerante", "Bebida", 10);
        Ex4 produto3 = new Ex4("Hamburguer", "Fast food", 30);
        Ex4 produto4 = new Ex4("Coca-cola", "Bebida", 5);
        Ex4 produto5 = new Ex4("Bolo", "Doce", 100);

        List<Ex4> produtos = List.of(produto1, produto2, produto3, produto4, produto5);

        Map<String, List<Ex4>> filtrados = produtos.stream()
                .filter(produto -> produto.preco >=50)
                .collect(Collectors.groupingBy(produto -> produto.categoria));
        System.out.println(filtrados.toString());
    }


}
