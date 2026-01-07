package EstruturaDados.list;

import java.util.ArrayList;
import java.util.List; //Interface

public class Lista {

    public static void main(String[] args) {
        //Array sem declarar tamanho
        List<String> lista = new ArrayList<>();
        //Adicionando após a declaração
        lista.add("objeto1");
        lista.add("objeto2");
        //Acesso aos valores por índicre
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        //Declarando um array e já passando os seus valores
        List<String> frutas = List.of("banana", "melão", "uva", "manga");
    }

}
