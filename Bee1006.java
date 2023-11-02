import java.util.Scanner;

public class Bee1006 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();

       double media = (a * 2 + b * 3 + c * 5) / 10.0;

       System.out.println("MEDIA = " + String.format("%.1f", media));

       sc.close();

    }
    
}
