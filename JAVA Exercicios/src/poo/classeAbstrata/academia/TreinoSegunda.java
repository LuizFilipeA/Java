package poo.classeAbstrata.academia;

public class TreinoSegunda extends TreinoAcademia{

    @Override
    void musculacao() {
        System.out.println("Treino de peito na segunda feira (sublclasse)");
    }

    @Override
    void cardio() {
        super.cardio();
    }

    public static void main(String[] args) {
        TreinoSegunda treinoSegunda = new TreinoSegunda();
        treinoSegunda.musculacao();
        treinoSegunda.cardio();
    }
}
