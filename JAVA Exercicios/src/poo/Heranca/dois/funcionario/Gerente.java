package poo.Heranca.dois.funcionario;

public class Gerente extends Funcionario {

    @Override
    float calcularBonus(float salario){
        return salario*0.2f;
    }

}
