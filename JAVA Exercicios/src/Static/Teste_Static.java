package Static;

public class Teste_Static {
    //Criamos alguns métodos e atributos, mas apenas o metodo "TestandoChamada() está estático
    //Quando vamos para a main, e acessamos a classe Teste_Static, apenas o "Testando chamada está disponível, pois os outros métodos e atributos da classe não são estáticos
    public int cont =0;

    public void Contador(){
        cont++;
    }

    public void y(){
        System.out.println("Pressionei o y");
    }

    public static void TestandoChamada(){
        System.out.println("Chamando método...");
    }

    public void U(){
        System.out.println("pressionei a tecla U");
    }
}
