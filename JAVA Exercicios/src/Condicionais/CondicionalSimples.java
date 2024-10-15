package Condicionais;

public class CondicionalSimples {
    public static void main(String[] args) {
        int imc = 29;
        if(imc<8){
            System.out.println("Você está raquítico");
        }else if (imc >= 9 && imc <= 19) {
            System.out.println("Você está magro");
        }else if (imc>=20 && imc<=30){
            System.out.println("Você está esbelto");
        }else if(imc >= 31 && imc<= 41){
            System.out.println("Você está gordo");
        }else if(imc > 41){
            System.out.println("Você está obeso! ");
        }
    }
}

// Raquítico de 0 a 8;
// Magro de 9 a 19;
// Esbelto de 20 a 30;
// Gordo de 31 a 41;
// Obeso acima de 41;