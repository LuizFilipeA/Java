package POO.GettersSetters;

public class Funcionario {

    int diastrabalhados = 22;

    void ola(){
        System.out.println("Seja bem vindo");
    }

    // GETS = PEGAR, OBTER, REFERENCIAR
    // E SETTERS = ALTERAR
    public void getDiastrabalhados(){
        System.out.println("Dias trabalhados: "+diastrabalhados);
    }

    public void setDiastrabalhados(int extra){
        diastrabalhados = diastrabalhados+extra;
    }
}

