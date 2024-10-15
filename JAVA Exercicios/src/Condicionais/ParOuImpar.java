package Condicionais;
import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println(numero+" é par");
        }else{
            System.out.println(numero+" é impar");
        }
    }
}