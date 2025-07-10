package Fundamentos.Tipos;

public class Objeto {
    String nome;
    String funcao;

    protected Objeto(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public static void main(String[] args) {
        Objeto objeto = new Objeto("Objeto", "Servir de exemplo nesse código");
        System.out.println("Olá, meu nome é:"+objeto.nome+" E minha função é:"+ objeto.funcao);
    }
}
