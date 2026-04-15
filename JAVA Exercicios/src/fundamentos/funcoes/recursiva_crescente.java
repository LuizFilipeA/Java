package fundamentos.funcoes;

public class recursiva_crescente {

    public static int intervalo(int a, int b){
        if (a > b){ //Condição de parada
            System.out.println("Validação a > b");
            return 0;// "Validação a > b" e retornará 0, indicando que o intervalo não é válido. Isso evita que o programa entre em um loop infinito ou tente acessar índices fora do intervalo definido.
        }
        return intervalo(a+1,b) +a; //A função intervalo é chamada recursivamente, incrementando o valor de a em 1 a cada chamada, até que a seja maior que b. A cada retorno da função, o valor de a é adicionado ao resultado da chamada recursiva, acumulando a soma dos números no intervalo definido por a e b.
    }

    public static void main(String[] args) {
        int a=1, b=3;
        System.out.println("Resultado do intervalo: "+intervalo(a, b));
    }
}
