package poo.Heranca.dois.funcionario;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Desenvolvedor desenvolvedor = new Desenvolvedor();

        //Partindo de uma situação onde o salário de um desenvolvedor e de um gerente é 10000
        System.out.println(gerente.calcularBonus(10000)); // 20% do salário
        System.out.println(desenvolvedor.calcularBonus(10000)); // 15% do salário
    }
}
