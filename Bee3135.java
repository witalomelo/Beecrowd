
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bee3135 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após o número N

        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        // Ordenar a lista de nomes por tamanho, da menor para a maior
        Collections.sort(nomes, new Comparator<String>() {
            @Override
            public int compare(String nome1, String nome2) {
                return Integer.compare(nome1.length(), nome2.length());
            }
        });

        // Imprimir os nomes na ordem solicitada
        int tamanhoAtual = nomes.get(0).length();
        for (String nome : nomes) {
            if (nome.length() > tamanhoAtual) {
                System.out.println();
                tamanhoAtual = nome.length();
            } else if (nome != nomes.get(0)) {
                System.out.print(" ");
            }
            System.out.print(nome);
        }

        scanner.close();
        
    }
    
}
