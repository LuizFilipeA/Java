package poo.classeAbstrata.academia;

public class TreinoTerca extends TreinoAcademia{

    @Override
    void cardio() {
        System.out.println("30 minutos de esteira (subclasse)");
    }

    @Override
    void luta() {
        super.luta();
    }
}
