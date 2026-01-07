package POO.ClasseAbstrata;

public class Pagamento1 extends FormasPagamento{

    //Em uma interface eu seria obrigado a implementar todos os métodos existentes "no contrato" porém, poderia implementar quantos "contratos eu quisesse"

    //Em uma classe abstrata só é possivel herdar de uma classe, porém, nem todos os métodos da classe pai são obrigatórios na classe filho
    @Override
    public void boleto() {
        super.boleto(); /*A palavra super em java é usada para acessar membros da classe pai (superclasse), servindo para invocar o construtor da classe pai, chamar um metodo da classe pai que foi substituído
        (sobrescrito) na classe filha ou referenciar uma variável de instância da classe pai quando há conflito de nomes. Para usá-la, você a utiliza com super()
        para construtores, super.metodo() para métodos, e super.variavel para variáveis. */

    }

}
