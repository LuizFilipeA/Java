package Fundamentos.Funcoes;

public class recursiva_crescente {

    public static int intervalo(int a, int b){
        if (a > b){
            System.out.println("Validação a > b");
            return 0;
        }
        return intervalo(a+1,b) +a;
    }

    public static void main(String[] args) {
        int a=1, b=3;
        System.out.println("Resultado do intervalo: "+intervalo(a, b));
    }
}
