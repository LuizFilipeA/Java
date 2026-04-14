package poo.Heranca.dois.funcionario;

    /*Exercício Difícil

Crie um sistema com herança e sobrescrita:

1. Classe base:

Funcionario

atributos:
nome
salario
metodo:
calcularBonus() → retorna 10% do salário
*/

public class Funcionario {

    private String nome;
    private float salario;

    float calcularBonus(float salario){ // 10% do salário
        return salario*0.1f;
    }
}
