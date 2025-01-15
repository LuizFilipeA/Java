package POO.bancoSimples;

public class BancoSimples {

    //Atributos
    private String titular;
    private float saldo =0;

    // Construtor
    public BancoSimples(){}
    public BancoSimples(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Ajustar saldo
    protected void ajustarSaldo(float valor){
        saldo=saldo+valor;
    }

    //Sacar
    protected void sacar(float saque){
        if (saque < saldo){
            System.out.println("O saque está sendo realizado...");
            ajustarSaldo(-saque);
        }else if (saldo == saque) {
            System.out.println("Realizando saque...");
            System.out.println("Sua conta está zerada");
            ajustarSaldo(-saque);
        }else {
        System.out.println("O saque não pode ser realizado");
        }
    }

    protected void depositar(float deposito){
        System.out.println("Depósito sendo realizado");
        ajustarSaldo(deposito);
    }

    //Ver saldo
    protected void getSaldo(String nome){
        System.out.println("\n"+titular);
        System.out.println("Seu saldo é de: "+saldo);
    }
}
