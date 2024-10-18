package POO.Heranca;

import static java.lang.Math.abs;

//Neste algoritmo gerente é um funcionário. Isto é uma afirmação.
//"Gerente extends Funcionario" exatamente o nome das classes dentro do package Herança
public class Gerente extends Funcionario{

    //Atributo que pertence somente a classe gerente, não pertence a classe geral de funcionários
    double bonus;


    // Digitei apenas cargaHoraria que é um dos métodos da classe Funcionário e foi possível herda-lá com um Override.
    // Override é sobrescrever métodos
    @Override
    public void cargaHoraria(float h1, float m1, float h2, float m2) {
        int minutos1 = (int) (h1*60+m1); // Somando todos os minutos da entrada
        int minutos2 = (int) (h2*60+m2); // Somando todos os minutos da saída
        int minutosTrabalhados = abs(minutos2-minutos1); // Saída - Entrada = Todos os minutos trabalhados naquele dia
        int hora = minutosTrabalhados/60;
        int minuto = abs(minutosTrabalhados % 60);
        if (hora<=8){
            System.out.println("Gerente, sua carga horária não foi atendida");
        }else{
            // If (operador ternário) dentro do print, se minuto for >=10 print 0+minuto. Ou seja, se os minutos forem menores de 10, adicione um zero. Exemplo 01, 02, 03, 04... invés de 1, 2, 3 e 4.
            System.out.println("Gerente, sua carga horária de trabalho será de: "+hora+":"+(minuto>=10 ? minuto : "0"+minuto));
        }
    }

    //Gerente herda beneficios, porém, sao benefícios diferentes da classe pai funcionário.
    @Override
    public void beneficios() {
        super.beneficios(); // Chama os atributos declarados na classe pai
        System.out.println("Décimo quarto");
        System.out.println("Décimo quinto");
        System.out.println("Décimo sexto");
        System.out.println("Participação nos lucros");
    }

    //Overload = Mesmo com três métodos iguais chamados "Bonus gerente" não existe conflito pois dentro dos parametros temos tipos diferentes de variáveis.
    // Java reconhece que sao métodos diferentes pois recebem parâmetros diferentes mesmo com o mesmo nome.
    public void bonusGerente(char n){
        System.out.println(n);
    }

    public void bonusGerente(float n){
        System.out.println(n);
    }
    public void bonusGerente(int n){
        System.out.println(n);
    }
}
