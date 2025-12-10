package POO.Encapsulamento;

public class MainEncapsulamento {
    public static void main(String[] args) {

        //Criando uma instância da classe filha na main
        ClasseFilha classeFilha = new ClasseFilha("12345678910", "Nome");
        System.out.println(classeFilha.toString());

        //A prova da força que possui o acesso private é que nas linhas abaixo, iremos acessar o atributo
        // cpf, e o nome, porem não conseguimos acessar o atributo conhecimento(que esta private na classe pai)

        System.out.println(classeFilha.cpf);
        System.out.println(classeFilha.nome);

        //System.out.println(classeFilha.conhecimento); retire essa linha de dentro do comentario e veja que apenas getConhecimento esta disponivel, pois é um metodo public
    }
}
