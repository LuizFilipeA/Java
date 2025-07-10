package POO.Generics;

public class Main {
    public static void main(String[] args) {
        Generic<String> teste = new Generic<>();
        teste.setValue("teste 1");
        System.out.println(teste.getValue());

        Generic<Integer> teste2 = new Generic<>();
        teste2.setValue(11);
        System.out.println(teste2.getValue());
    }
}
