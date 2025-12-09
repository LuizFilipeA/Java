//Throws (lançar) é a personalização no tratamento de dados

package Fundamentos.TratamentoExcecoes.TryCatchFinally;

//Use throws na assinatura do metodo para declarar que ele pode lançar uma exceção (exceções verificadas) e delegar o tratamento ao chamador "Throw
public class Throws {

    static float notasf(float[] notas) throws IllegalAccessException{
        float soma=0f;
        for (int i=0;i<notas.length;i++){ //percorremos a lista com o valor do seu tamanho(lenght), porem uma iteracao com for(nota: notas) tambem seria possivel ser utilizada
            if (notas[i]>10 || notas[i]<0){ //Se alguma nota for maior que 10 ou menor que zero
                // a excecao sera lancada com o throw:
                throw new IllegalAccessException("Digite uma nota válida ");
            }
            soma = soma +notas[i];
        }
        return soma/notas.length; //retorna um float do valor total somado de todas as notas, dividido pelo numero de notas (media)
    }

    //Poderiamos ter separado essa classe main abaixo, mas foi declarada dentro da Classe Throws mesmo.
    public static void main(String[] args) {
        float notas[] = {1.2f, 0, 11, 1};
        try{
            float resultado =notasf(notas);
            System.out.println("A média é: "+resultado);
        }catch (IllegalAccessException iae){
            System.out.println(iae.getMessage()); //o getMessage em questao e o mesmo que digitamos na linha 13 "throw new IllegalAccessException("Digite uma nota válida ");"
        }
    }
}
