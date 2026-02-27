public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("Original String:" + original);
            System.out.println("Reversed String" + reversed);
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("Original String:" + original);
            System.out.println("Reversed String" + reversed);
            System.out.println("The given string is NOT a Palindrome.");


        }
    }
}


