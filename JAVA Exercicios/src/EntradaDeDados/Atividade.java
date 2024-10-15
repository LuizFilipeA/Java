package EntradaDeDados;

public class Atividade {
    public static void main(String[] args) {
        //a) Nome do usuário (String)
        String nomeUsuario = "Joao";
        System.out.println("Nome de usuário: " + nomeUsuario);

        //b) CPF (inteiro)
        String cpf ="12345678900";
        System.out.println("CPF: " + cpf); // Não consegui exibir a saída de dados de números maiores

        //c) Salário (float)
        float salario = 15678.55f;
        System.out.println("Salário R$: " + salario);

        //d) Telefone (int)
        String telefone = "11123456789";
        System.out.println("Número de telefone: " + telefone);

        //e) e-mail (String)
        String email = "email@email.com";
        System.out.println("Email: " + email);

        //f) Whatsapp (int)
        String whatsapp = "11123456789";
        System.out.println("Whatsapp : " + whatsapp);

        //g) Profissão (int)
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
