import java.util.LinkedList;
import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            LinkedList<Integer> cartasDescartadas = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                cartasDescartadas.add(i);
            }

            StringBuilder descartadas = new StringBuilder();
            while (cartasDescartadas.size() >= 2) {
                if (descartadas.length() > 0) {
                    descartadas.append(", ");
                }
                descartadas.append(cartasDescartadas.poll());
                cartasDescartadas.add(cartasDescartadas.poll());
            }

            System.out.println("Discarded cards: " + descartadas);
            System.out.println("Remaining card: " + cartasDescartadas.poll());
        }

        sc.close();
    }
    
}
