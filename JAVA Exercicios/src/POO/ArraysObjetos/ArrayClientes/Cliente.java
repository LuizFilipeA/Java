package POO.ArraysObjetos.ArrayClientes;

public class Cliente {

    private Integer id;
    private String nome;
    private String email;

    //Construtor sem parâmetro
    public Cliente(){}

    //Construtor com todos os parâmetros
    public Cliente(Integer id, String email, String nome) {
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    //Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
