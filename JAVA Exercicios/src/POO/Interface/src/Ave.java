package POO.Interface.src;

//Vamos partir do pensamento bobo que é "TODA ave voa, porém são voos diferentes", neste caso, uma interface pode ser aplicada, pois a interface é semelhante a um contrato. 100% das funções e procedimentos
// nela declarada devem ser implementadas na classe ou objeto que for implementado.
public interface Ave{
    default void voar(){}
}
