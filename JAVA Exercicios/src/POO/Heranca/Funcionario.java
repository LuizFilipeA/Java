package POO.Heranca;

public class Funcionario {
    String nome;
    short idade;
    char setor;
    int credencial;

    public void cargaHoraria(float h1, float m1, float h2, float m2){
        System.out.println("Sua carga horária de trabalho como funcionário será de: "+((h2-h1)+(m2-m1)));
    }

    public void beneficios(){
        System.out.println("Vale alimentação");
        System.out.println("Auxílio creche");
        System.out.println("Auxílio combustível");
        System.out.println("Total pass");
        System.out.println("Vale refeição");
        System.out.println("Plano de saúde integral");
    }
}
