package EstruturaDados.set;

import java.util.HashSet; //implementação hash


public class Set {
    public static void main(String[] args) {
        java.util.Set<String> setString= new HashSet<>();

        setString.add("String1");
        setString.add("String2");
        setString.add("String3");
        setString.add("String3"); //Set não permite valores duplicados

        System.out.println(setString);
        System.out.println(setString.contains("String3")); //contains retorna um boolean
        System.out.println(setString.contains("String4"));

    }
}
