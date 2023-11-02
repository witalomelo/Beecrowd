
import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double raio = sc.nextDouble();

        double area = raio * raio * 3.14159;

        System.out.println(String.format("%s%.4f", "A=", area));
    }
    
}
