package poo.generics.ex4;

/*Crie uma classe genérica chamada:

Par<T>

Ela deve:

    guardar dois valores do mesmo tipo

    ter:

        atributo primeiro

        atributo segundo

    criar:

        construtor

        getters

        método para mostrar os valores

Depois:

    crie um Par<String>

    crie um Par<Integer>
*/

public class Par<T> {
    private T primeiro;
    private T segundo;

    public Par(T primeiro, T segundo){
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public T getSegundo() {
        return segundo;
    }

    public void setSegundo(T segundo) {
        this.segundo = segundo;
    }

    public static void main(String[] args) {
        Par<String> parString = new Par<>("Hello", "World");
        System.out.println("Par String: " + parString.getPrimeiro() + " " + parString.getSegundo());

        Par<Integer> parInteger = new Par<>(1, 2);
        System.out.println("Par Integer: " + parInteger.getPrimeiro() + " " + parInteger.getSegundo());
    }
}