package POO.Encapsulamento;

public class ClassePai {

    //Public = vísivel em qualquer lugar
    public String nome;
    //Protected = visivel para o package, classes e subclasses
    protected String cpf;
    //Private = totalmente privada, visivel apenas dentro da classe.
    private String conhecimento= "conhecimento próprio";

    //Construtor com parametros
    public ClassePai(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConhecimento() {
        return conhecimento;
    }

    @Override
    public String toString() {
        return "ClassePai{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conhecimento='" + conhecimento + '\'' +
                '}';
    }
}
