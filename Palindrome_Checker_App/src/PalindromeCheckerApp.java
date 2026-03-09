class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; this.next = null; }
}

class LinkedList {
    Node head;

    void addString(String str) {
        for (char ch : str.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
            }
        }
    }

    Node reverse(Node node) {
        Node prev = null, curr = node, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);
        Node firstHalf = head, tempSecond = secondHalf;
        boolean palindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        slow.next = reverse(secondHalf);
        return palindrome;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar"; // hardcoded input
        System.out.println("Checking string: " + input);

        LinkedList list = new LinkedList();
        list.addString(input.replaceAll("\\s+", "").toLowerCase());

        if (list.isPalindrome())
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is NOT a palindrome.");
    }
}