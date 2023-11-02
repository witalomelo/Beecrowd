import java.util.Scanner;
import java.util.Stack;

public class Bee1068 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (isValidExpression(input)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }

        sc.close();
    }

    public static boolean isValidExpression(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    
}
