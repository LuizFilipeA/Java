package POO.Heranca.HerancaSimples;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.cargaHoraria(7, 0, 17, 20);
        g1.beneficios();
        g1.credencial = 1000;
        System.out.println(g1.credencial);
    }
}
