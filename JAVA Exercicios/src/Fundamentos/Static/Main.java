package Fundamentos.Static;

public class Main {
    //metodo main é um "executável" e estático, logo qualquer outro atributo ou metodo para ser referenciado/utilizado necessariamente precisa ser static também.
    public static void main(String[] args) {
        //note que apenas o TestandoChamada() pode ser chamado da classe Teste_Static.
        Teste_Static.TestandoChamada();
    }
}