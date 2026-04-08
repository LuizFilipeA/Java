package fundamentos.condicionais;

public class OpTernario {
    public static void main(String[] args) {
        float media = 10;
        String resultado = (media >=7 && media <=10)? "Aprovado": "Reprovado";
        System.out.println(resultado);

        media = 6;
        boolean resultado2 = (media >=7 && media <=10)? true: false;
        System.out.println(resultado2);

    }
}
