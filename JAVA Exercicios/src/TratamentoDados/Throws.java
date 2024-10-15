//Throws (lançar) é a personalização no tratamento de dados

package TratamentoDados;

public class Throws {

    static float notasf(float[] notas) throws IllegalAccessException{
        float soma=0f;
        for (int i=0;i<notas.length;i++){
            if (notas[i]>10 || notas[i]<0){
                throw new IllegalAccessException("A nota digita está inválida");
            }
            soma = soma +notas[i];
        }
        return soma/notas.length;
    }

    public static void main(String[] args) {
        float notas[] = {1.2f, 0, 10, 1};
        try{
            float resultado =notasf(notas);
            System.out.println("A média é: "+resultado);
        }catch (IllegalAccessException iae){
            System.out.println(iae.getMessage());
        }
    }
}
