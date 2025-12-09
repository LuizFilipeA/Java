package POO.ArraysObjetos.ArrayClientes;

import java.util.ArrayList;

public class ArrayClientes {

    //Declarando um arraylist static que irá armazenar objetos da Classe Cliente
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    //Declarando o metodo main para melhorar a visualização do exemplo de ArrayList de classes
    public static void main(String[] args) {

        //Instanciando 3 clientes com o operador new
        Cliente clienteInstancia= new Cliente(01, "email@email", "Cliente1");
        Cliente clienteInstancia2 = new Cliente(02, "email2@email", "Cliente2");
        Cliente clienteInstancia3 = new Cliente(03, "email3@email", "Cliente3");

        //Adicionando os tres clientes na ArrayList de clientes
        clientes.add(clienteInstancia);
        clientes.add(clienteInstancia2);
        clientes.add(clienteInstancia3);

        //Iteração percorrendo a lista de clientes e exibindo seus atributos
        for (Cliente cliente: clientes){
            System.out.println(cliente.getId()+cliente.getNome()+cliente.getEmail());
        }
    }
}
