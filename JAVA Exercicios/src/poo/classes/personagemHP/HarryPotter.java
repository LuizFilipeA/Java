package poo.classes.personagemHP;

public class HarryPotter extends PersonagemHp {

    @Override
    public void patrono() {
        System.out.printf("O patrono do %s é um cervo %n", getNome());
    }
}