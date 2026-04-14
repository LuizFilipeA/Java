package poo.Heranca.dois.funcionario;

public class Desenvolvedor extends Funcionario{

    @Override
    float calcularBonus(float salario) {
        return salario*0.15f;
    }
}
