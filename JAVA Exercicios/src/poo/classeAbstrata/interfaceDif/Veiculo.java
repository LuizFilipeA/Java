package poo.classeAbstrata.interfaceDif;

/*Diferença entre classes abstratas e interfaces

Classe abstrata
- Pode ter métodos concretos E abstratos (mas apenas os abstratos são obrigatoriamente implementados pela sub classe)
- Pode ter atributos
- Permite herança única

Interface-
- Define apenas contratos (o que deve ser feito, assinatura de métodos)
- TODOS os métodos devem ser implantados
- Permite MULTIPLAS implementações

Quando usar?
Use interfaces quando quiser definir um "contrato" de comportamento que será implementado por classes que podem não ter nenhuma relação hierárquica entre si. Use classes abstratas quando quiser compartilhar código, possuir estado (atributos) e definir um esqueleto comum para classes fortemente relacionadas
 */

public abstract class  Veiculo {

    protected String modelo;
    protected int velocidade;

    public void acelerar(){
        velocidade += 10;
        System.out.println("Veículo acelerando! Velocidade :"+velocidade);
    }

    public abstract void frear();
}
