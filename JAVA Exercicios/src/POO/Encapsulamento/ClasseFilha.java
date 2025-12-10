package POO.Encapsulamento;

//Herdando explicitamente a classe pai com o extends
public class ClasseFilha extends ClassePai{

    //Construtor da classe filha recebendo os parâmetros
    public ClasseFilha(String cpf, String nome){

        //O metodo super em Java é uma palavra-chave usada em classes filhas (subclasses) para acessar membros (campos,
        // métodos e construtores) da classe pai (superclasse) imediata, garantindo a herança e a reutilização de código,
        // sendo essencial para chamar construtores da classe pai e métodos sobrescritos da superclasse, mantendo a ordem
        // correta de inicialização e funcionalidade
        super(cpf, nome);
    }
}
