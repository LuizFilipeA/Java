package Fundamentos.TiposPrimitivos;

public class Tipos {

    byte n1; //byte: Um inteiro de 8 bits, com faixa de -128 a 127
    short n2; //short: Um inteiro de 16 bits, com faixa de -32.768 a 32.767
    int n3; //int: Um inteiro de 32 bits, com faixa de -2.147.483.648 a 2.147.483.647
    long n4; //long: Um inteiro de 64 bits, com faixa de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    float n5; //float: Um número de ponto flutuante de 32 bits
    double n6; //double: Um número de ponto flutuante de 64 bits
    char letra; //char: UM caractere Unicode de 16 bits.
    boolean isTrue; //boolean: Um valor booleano, podendo ser true ou false

    //Bonus: VAR só pode ser usado para variáveis locais inicializadas na mesma linha
    public static void main(String[] args) {
        var nome = "Luiz Filipe"; //Reconhecendo uma string sem precisar declarar explicitamente
        System.out.println(nome);
        var idade = 26; //Reconhecendo um decimal sem precisar declarar explicitamente
        System.out.println(idade);
    }
}
