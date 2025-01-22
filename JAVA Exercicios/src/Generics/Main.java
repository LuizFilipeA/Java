package Generics;

public class Main {
    public static void main(String[] args) {
        Generic<String> teste = new Generic<>();
        teste.setValue("teste 1");
        System.out.println(teste.getValue());
    }
}
