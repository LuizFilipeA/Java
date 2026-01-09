package POO.Generics.ex2;

import java.util.List;

public class Mochila <T>{

    private List<T> mochila;

    public void adicionarItem(T item){
        mochila.add(item);
    }
}
