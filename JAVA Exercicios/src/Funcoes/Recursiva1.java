package Funcoes;

public class Recursiva1 {

    public static void a2(){
        System.out.println("Chamando função a1");
        a1();
        //bloco de código aqui
    }


    public static void a1(){
        System.out.println("Chama função n" );
        // bloco de código aqui
    }


    public static void main (String[] args){
        System.out.println("public static void main");
        a2();
    }
}
