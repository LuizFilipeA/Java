package AtividadesCurso.BateriaExercicio2.Car;


//  1ª tarefa: Carros - Crie uma classe chamada "Carro" que tenha
//atributos como "marca", "modelo" e "ano".
//o Crie pelo menos dois objetos dessa classe com valores
//diferentes para esses atributos.
//o Utilize os métodos de acesso construtor para definir e
//obter os valores dos atributos dos objetos.
//o Lembre-se que os atributos devem ser nomeados com o
//modificador de acesso private.
//o Imprima as informações dos carros no console

public class Car {
    private String marca;
    private String modelo;
    private String ano;

    public Car(String modelo, String ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
