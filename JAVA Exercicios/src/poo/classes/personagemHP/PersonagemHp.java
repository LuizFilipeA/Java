package poo.classes.personagemHP;

public class PersonagemHp {

    private String nome;

    public void patrono(){
        System.out.println("Meu patrono padrão super (classe pai)");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
