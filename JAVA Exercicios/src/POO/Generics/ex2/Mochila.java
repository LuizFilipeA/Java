package POO.Generics.ex2;

import java.util.List;

public class Mochila <T>{
    private List<T> mochilaTrabalho;

    public void adicionarItem(T item){
        try{
         mochilaTrabalho.add(item);
        }catch (NullPointerException npe){
            System.out.println("A mochila está vazia (null). Inicialize a lista antes de adicionar itens.");
        }

    }

    public void mostrarItens(){
        try{
            for (T item : mochilaTrabalho){
                System.out.println(item.toString());
            }
        }catch (NullPointerException npe){
            System.out.println("Mochila de trabalho vazia. Coloque itens na mochila antes de mostrar os itens.");
        }
    }
}
