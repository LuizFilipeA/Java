package Fundamentos.Funcoes;

public class recursiva_decrescente {
    public static int intervalo(int a, int b){
        if (b<a){
            return 0;
        }
    return intervalo(a, b-1)+ b;
    }

    public static void main(String[] args) {
        int a=1, b=10;
        System.out.println(intervalo(a, b));
    }
}
