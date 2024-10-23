package EntradaDeDados;

public class Atividade {
    public static void main(String[] args) {
        //a) Nome do usuário (String)
        String nomeUsuario = "Joao";
        System.out.println("Nome de usuário: " + nomeUsuario);

        //b) CPF (long)
        long cpf =12345678900l;
        System.out.println("CPF: " + cpf);

        //c) Salário (double)
        double salario = 15678.55;
        System.out.println("Salário R$: " + salario);

        //d) Telefone (int)
        long telefone = 11123456789l;
        System.out.println("Número de telefone: " + telefone);

        //e) e-mail (String)
        String email = "email@email.com";
        System.out.println("Email: " + email);

        //f) Whatsapp (long)
        String whatsapp = "11123456789";
        System.out.println("Whatsapp : " + whatsapp);

        //g) Profissão (String)
        String profissao = "Desenvolvedor Java";
        System.out.println("Profissão : " + profissao);

        //h) Se mora no centro da cidade (boolean)
        boolean centroCidade = true;
        System.out.println("Mora no centro da cidade? : " + centroCidade);

        //i) Casado (boolean)
        boolean casado = false;
        System.out.println("É casado?: " + casado);
    }
}
