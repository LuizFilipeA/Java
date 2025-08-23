package POO.Biblioteca;

public class User {
    //Atributos
    long idUsuario=0;
    String nomeUsuario;

    //Construtores
    public User(){}
    public User(long idUsuario, long telefone, String nomeUsuario){}

    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    //imprimir Usuário
    public String imprimir(){
        return this.idUsuario + ", "+this.nomeUsuario+ ", ID "+this.idUsuario;
    }

    //Gerador de ID
    protected long gerarId() {
        this.idUsuario = this.idUsuario + 1;
        return this.idUsuario;
    }
}
