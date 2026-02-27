import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();

        }
        System.out.println("Input String: " + input);
        if (input.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }
}