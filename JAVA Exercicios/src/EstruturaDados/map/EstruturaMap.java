package EstruturaDados.map;

import java.util.HashMap;
import java.util.Map;

public class EstruturaMap {

    public static void main(String[] args) {
        /* Map<String,String> cadastro = new HashMap<>();
        cadastro.put("nome", "Luiz Felipe");
        cadastro.put("sobrenome", "AS");
        System.out.println(cadastro.get("nome")); // = retorna Luiz Felipe consultando o map pela chave "nome"

        //Como estamos utilizando a estrutura HashMap, o primeiro valor inserido na chave nome foi substituido
        cadastro.put("nome", "Felipe Luiz");
        System.out.println(cadastro.get("nome"));// = retorna Felipe Luiz consultando o map pela chave "nome"
        */

        Map<Long, Cliente> clientes = new HashMap<>();
        Cliente cliente1 = new Cliente(12345678901234L, "Cliente 1", 123455680960L);
        Cliente cliente2 = new Cliente(98765432109876L, "Cliente 2", 987654320123L);
        Cliente cliente3 = new Cliente(19283746509123L, "Cliente 3", 192837465012L);
        clientes.put(cliente1.cnpj, cliente1);
        clientes.put(cliente2.cnpj, cliente2);
        clientes.put(cliente3.cnpj, cliente3);

        System.out.printf(clientes.get(12345678901234L).toString());

    }
}
