package Fundamentos.ManipulacaoStrings.Split;

public class Split {

    public static void main(String[] args) {

        //Split traduzindo para o português "dividir, separar". No exemplo abaixo nós temos uma contendo o nome de algumas frutas e iremos utilizar o split para separar todas as strings pela ","
        //Também é possível separar por espaços " "
        String lista = "Maçã, Banana, Morango, Uva, Melão";
        String[] frutas = lista.split(","); // Neste exemplo em específico nós utilizamos apenas um parametro a vírgula " ,"
        for (String fruta: frutas){
            System.out.println(fruta);
        }

        String numeros = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";
        String[] numerosAteDez = numeros.split("," , 11); //Passando um limite, podemos ver que apenas os números de 1 até 10 foram splitados, o resto da string permaneceu junta
        for (String numero: numerosAteDez){
            System.out.println(numero);
        }
    }
}
