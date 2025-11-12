package Fundamentos.Funcoes;

public class Recursiva1 {

    public static void a1(){
        System.out.println("a1()" );
        // bloco de código aqui
    }


    public static void a2(){
        System.out.println("a2()");
        a1();
        //bloco de código aqui
    }


    public static void main (String[] args){
        System.out.println("public static void main"); //Na execução do programa é possível ver que a função main (função principal) é a primeira a ser executada no nosso programa
        a2();
    }
}
