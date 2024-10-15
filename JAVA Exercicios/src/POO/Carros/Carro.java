package POO.Carros;

public class Carro {
    /// 2) que tenha atributos como "marca", "modelo" e "ano"
    private String marca; /// 4) Os atributos devem ser nomeados com o modificador de acesso "private"
    private String modelo;
    private int ano;

    /// 3.1) Tem que utilizar métodos de acesso getters
    public void getModelo(){
        System.out.println("Modelo: "+modelo);
    }
    public void getMarca(){
        System.out.println("Marca: "+marca);
    }
    public void getAno(){
        System.out.println("Ano de fabricação: "+ano);
    }
    public void infocarro(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Ano de fabricação: "+ano);
    }

    /// 3.2) Tem que utilizar setters para definir e obter os valores dos atributos dos objetos
    public void setMarca(String altmarca) {
        marca = altmarca;
    }
    public void setModelo(String altmodelo){
        modelo=altmodelo;
    }
    public void setAno(int altano) {
        ano=altano;
    }
}
