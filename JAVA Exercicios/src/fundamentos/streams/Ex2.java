package fundamentos.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {

        List<String> nomes = List.of("Ana", "Bruno", "Carla", "Daniel", "Eduardo", "Fernanda");

        List<String> nomesMaiorQue= nomes.stream()
                .filter(nome -> nome.length() > 4) // Filtra nomes com mais de 4 caracteres
                .map(String::toUpperCase) // Converte os nomes filtrados para maiúsculas
                .collect(Collectors.toList()); // Coleta o resultado em uma nova lista chamada "nomesFiltrados"

        List<String> nomesComA = nomes.stream()
                .filter(nome -> nome.startsWith("A")) //nome é elemento da Stream
                .map(String::toUpperCase) // para cada String
                        .collect(Collectors.toList());     //.toList(): É um coletor. Ele "empacota" os dados e te entrega uma caixa (Lista). Retorna List<T>.

        System.out.println(nomesComA);
        System.out.println(nomesMaiorQue);
    }
}
