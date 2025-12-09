package POO.Final;

public class Filho extends Pai{
    /*um atributo final é semelhante á uma constante, não poderá ser alterada nem mesmo com herança e polimorfismo.
    esta classe filho, está recebendo uma herança da classe pai pelo "extends" e mesmo assim, após este comentário,
    iremos tentar herdar o metodo mensagem, e ele não será "reconhecido" pelo java, pois o metodo Mensagem() da classe
    pai, recebeu uma atribuição final, porém, o metodo mensagem2() será herdado normalmente, pois não recebeu atribuição final*/

    @Override
    public void Mensagem2() { //metodo da classe pai sem final
        super.Mensagem2();
    }

    //Mensagem(){} //metodo da classe pai com final (irreconhecível)
}
