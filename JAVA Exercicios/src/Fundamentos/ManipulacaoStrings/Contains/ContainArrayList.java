package Fundamentos.ManipulacaoStrings.Contains;

import java.util.ArrayList;
import java.util.List;

//O metodo contains em Java é amplamente utilizado para verificar a presença de um elemento ou sequência dentro de uma coleção de dados (como listas e conjuntos) ou em uma string.
public class ContainArrayList {

    public static void main(String[] args) {

        //Declarando a ArrayList chamada frutas
        List<String> frutas= new ArrayList<>();

        //Declaração de variáveis
        boolean temBanana = frutas.contains("Morango");
        boolean temUva = frutas.contains("Uva");

        //Adicionando frutas
        frutas.add("Maçã");
        frutas.add("Mamão");
        frutas.add("Morango");
        frutas.add("Banana");

        System.out.println("Tem banana?"+ temBanana);
        System.out.println("Tem uva? "+ temUva);
    }
}
