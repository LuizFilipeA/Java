package EstruturaDados.map;

import java.util.HashMap;
import java.util.Map;

public class EstruturaMap {

    public static void main(String[] args) {
        Map<String,String> cadastro = new HashMap<>();
        cadastro.put("nome", "Luiz Felipe");
        cadastro.put("sobrenome", "AS");
        System.out.println(cadastro.get("nome")); // = retorna Luiz Felipe consultando o map pela chave "nome"

        //Como estamos utilizando a estrutura HashMap, o primeiro valor inserido na chave nome foi substituido
        cadastro.put("nome", "Felipe Luiz");
        System.out.println(cadastro.get("nome"));// = retorna Felipe Luiz consultando o map pela chave "nome"
    }
}
