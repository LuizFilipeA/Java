package POO.ClasseAbstrata;

public abstract class FormasPagamento {

    /* A principal diferença entre classes e interfaces, é que interfaces definem um "contrato" (métodos que as classes devem implementar) e suportam herança múltipla, enquanto classes abstratas
    permitem herança única, fornecem uma implementação parcial ou completa de métodos e podem ter atributos de instância. Apesar de assim como a interface, a classe abstrata também nao pode ser instanciada diretamente.
    Uma classe abstrata está mais relacionada a uma hierarquia de "é um tipo de", enquanto uma interface define uma capacidade ou "é capaz de" */

    public void boleto(){
        System.out.println("Insira sua lógica para receber via boletos aqui");
    }

    public void dinheiro(){
        System.out.println("Insira sua lógica para receber dinheiro aqui");
    }

    public void cartaoCredito(){
        System.out.println("Insira sua lógica para receber em cartão de crédito aqui");
    }

}
