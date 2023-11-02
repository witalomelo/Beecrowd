import java.util.Scanner;

public class Bee1005 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double notaA, notaB, res;

        notaA = sc.nextDouble();
        notaB = sc.nextDouble();

        res = (notaA * 3.5 + notaB * 7.5) / 11.0;

        System.out.println("MEDIA = " + String.format("%.5f", res));

        sc.close();

    }

}
    

