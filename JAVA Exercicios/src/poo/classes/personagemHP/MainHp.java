package poo.classes.personagemHP;

public class MainHp {
    public static void main(String[] args) {

        PersonagemHp[] personagensHp = new PersonagemHp[2];

        personagensHp[0]= new HarryPotter();
        personagensHp[1]= new RonaldWeasley();

        personagensHp[0].setNome("Harry Potter");
        personagensHp[1].setNome("Ronald Weasley");

        personagensHp[0].patrono();
        personagensHp[1].patrono();
    }
}
