
package POO.Construtor;

/** Um construtor em Java é um metodo que inicializa um objeto de uma classe.
 *  O construtor é chamado automaticamente quando um novo objeto é criado.**/

public class Computador {
    String memory;
    String motherBoard;
    String processor;

    //Construtor com parâmetros:
    //O construtor DEVE ter o mesmo nome da classe e PODE ou não receber parâmetros.
    public Computador(String memory, String motherBoard, String processor){
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.processor = processor;
    }

    //Construtor sem parâmetros:
    public Computador(){
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.processor = processor;
    }

    // *  É invocado pelo operador new
    public static void main(String[] args) {
        Computador pc = new Computador("8GB", "Asus", "Intel");
    }
}
