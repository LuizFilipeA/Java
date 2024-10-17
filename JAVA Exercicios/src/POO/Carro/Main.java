package POO.Carro;

public class Main {
    public static void main(String[] args) {

        // 5) Imprima as informações no console
        System.out.println("Olá, seja bem vindo a garagem JAVA! " );

        //Construindo o primeiro objeto da classe carro, c1
        Carro c1 = new Carro();
        c1.setModelo("Celta");
        c1.setAno(2008);
        c1.setMarca("GM"); /// Atributo a ser alterado para teste

        /// Testando alteração
        System.out.println("Testando alteração:");
        c1.getMarca();
        c1.setMarca("GM");
        c1.getMarca();

        /// Exibindo informações do carro
        c1.infocarro();

        /// Construindo o segundo objeto da classe carro, c2
        Carro c2 = new Carro();
        c2.setModelo("Civic");
        c2.setMarca("Honda");
        c2.setAno(2024);
        c2.infocarro();

        Carro c3 = new Carro();
        c3.setModelo("Palio");
        c3.setMarca("Fiat");
        c3.setAno(1999);
        c3.infocarro();

    }
}
