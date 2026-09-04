package minhaTrilha.estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    public static void main(String[] args) {

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Notebook", 10);
        estoque.put("Mouse", 25);
        estoque.put("Teaclado", 15);
        estoque.put("Monitor", 8);
        estoque.put("Headset", 12);

        ///Iterando com entrySet (Chave e Valor)A melhor forma de pegar a chave e o valor ao mesmo tempo é usando o map.entrySet().
        for(Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println("Produto: " +entry.getKey() + " - Quantidade: " + entry.getValue() + entry.getClass());
        }
        ///Iterando apenas pelas Chaves Se você precisar só das chaves do mapa, use o método keySet()
        for(String chave: estoque.keySet()) {
            System.out.println("Produto: " + chave);
        }
        ///Iterando apenas pelos ValoresSe você precisar só dos valores do mapa, use o método values()
        for(Integer valor: estoque.values()) {
            System.out.println("Quantidade: " + valor);
        }

        estoque.forEach((chave, valor) -> System.out.println("Produto: " + chave + " - Quantidade: " + valor));
    }
}
