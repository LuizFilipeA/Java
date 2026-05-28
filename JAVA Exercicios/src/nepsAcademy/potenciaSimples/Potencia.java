    package nepsAcademy.potenciaSimples;

    import java.util.Scanner;

    /*
    Entrada

    A entrada é composta por apenas uma linha que contem dois números reais, xx e yy.
    Saída

    Seu programa deve imprimir um único número xyxy com 4 casas decimais de precisão.
    */
    public class Potencia {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            double resultado = Math.pow(n1, n2);
            System.out.printf("%.4f", resultado);
        }
    }
