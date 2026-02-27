import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char frontChar = deque.removeFirst();
            char rearChar = deque.removeLast();
            if (frontChar != rearChar) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}