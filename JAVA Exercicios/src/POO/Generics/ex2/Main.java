package POO.Generics.ex2;

public class Main {

    public static void main(String[] args) {

        Mochila<Object> mochila = new Mochila<>();
        mochila.adicionarItem(new Garrafa("Garrafa de Água 1.5L"));
        mochila.adicionarItem(new Livro("Nada pode me ferir"));
        mochila.adicionarItem(new GuardaChuva("guarda-chuva preto quebrado"));
    }
}
