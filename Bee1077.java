import java.util.Scanner;
import java.util.Stack;

public class Bee1077 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após o número

        while (n > 0) {
            String infixExpression = sc.nextLine();
            String postfixExpression = infixToPostfix(infixExpression);
            System.out.println(postfixExpression);
            n--;
        }

        sc.close();
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Erro: Expressão inválida";
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int precedence(char operator) {
        if (operator == '^') {
            return 3;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '+' || operator == '-') {
            return 1;
        }
        return 0;
    }
    
}
