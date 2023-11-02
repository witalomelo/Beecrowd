import java.util.HashMap;
import java.util.Scanner;

public class Bee2460 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        HashMap<Integer, Integer> fila = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int identificador = scanner.nextInt();
            fila.put(identificador, i + 1);
        }

        int M = scanner.nextInt();
        
        for (int i = 0; i < M; i++) {
            int pessoaQueSaiu = scanner.nextInt();
            fila.remove(pessoaQueSaiu);
        }

        scanner.close();
        
        fila.values().forEach(id -> System.out.print(id + " "));
    }
    
}
