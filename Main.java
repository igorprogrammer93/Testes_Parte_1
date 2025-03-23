import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static List<String> filtrarMulheres(List<String> pessoas) {
        return pessoas.stream()
            .filter(p -> {
                String[] partes = p.split("-");
                return partes.length == 2 && partes[1].equalsIgnoreCase("F");
            })
            .map(p -> p.split("-")[0])
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a lista de pessoas (ex: Ana-F, João-M, Maria-F):");
        String input = scanner.nextLine();

        List<String> pessoas = Arrays.asList(input.split("\\s*,\\s*"));
        List<String> mulheres = filtrarMulheres(pessoas);

        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}

