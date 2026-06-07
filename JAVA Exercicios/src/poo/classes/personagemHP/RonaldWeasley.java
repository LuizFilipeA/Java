package poo.classes.personagemHP;

public class RonaldWeasley extends PersonagemHp {

    @Override
    public void patrono(){
        System.out.printf("O patrono do %s é um cão %n", getNome());

       super.patrono();
    }
}
