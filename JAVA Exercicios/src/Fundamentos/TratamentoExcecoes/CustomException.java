package Fundamentos.TratamentoExcecoes;

//Nossa custom Exception herdará a classe Exception explicitamente
public class CustomException extends Exception{

    // A mensagem personalizada é inserida dentro do construtor, construtor sem argumentos:
    public CustomException() {
        System.err.println(" Exceção customizada: Eu sou a mensagem personalizada do construtor sem parâmetro");
    }

    //Neste caso, o construtor recebe a mensagem por parâmetro
    public CustomException(String message) {
        //Invoca o construtor da classe pai
        super(message);
    }

    //Iremos declarar o metodo main dentro dessa classe apenas para melhor visualização

    //é necessário assinar o metodo utilizando "throws" e o nome da exception, exemplo abaixo:
    public static void main(String[] args) throws CustomException {
        int x = 0;

        try{
            if (x==0){
                //1. Lançando a Exceção com uma Mensagem Personalizada
                throw new CustomException("Exceção customizada: Eu sou a mensagem personalizada do construtor com parâmetro");
            }

            //Dentro do catch podemos recuperar uma mensagem já passada pelo construtor
        } catch (NullPointerException npe) {
            npe.getMessage();
            //ou podemos passar a nova mensagem (personalizada) através do system.err.out
        } catch (Exception e){
            System.err.println(" Error - Mensagem personalizada dentro do catch");
        }
    }

}











