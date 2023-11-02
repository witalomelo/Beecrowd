import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Bee1062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            while (true) {
                int[] trainOrder = new int[n];
                for (int i = 0; i < n; i++) {
                    trainOrder[i] = sc.nextInt();
                    if (trainOrder[0] == 0) {
                        System.out.println();
                        break;
                    }
                }

                if (trainOrder[0] == 0) {
                    break;
                }

                Stack<Integer> station = new Stack<>();
                int expectedCoach = 1;

                for (int coach : trainOrder) {
                    while (!station.isEmpty() && station.peek() == expectedCoach) {
                        expectedCoach++;
                        station.pop();
                    }

                    if (coach == expectedCoach) {
                        expectedCoach++;
                    } else {
                        station.push(coach);
                    }
                }

                while (!station.isEmpty() && station.peek() == expectedCoach) {
                    expectedCoach++;
                    station.pop();
                }

                System.out.println(station.isEmpty() ? "Yes" : "No");
            }
        }

        sc.close();
    }
    
}
