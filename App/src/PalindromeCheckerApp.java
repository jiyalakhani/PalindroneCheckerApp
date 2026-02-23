import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC7: Deque-Based Optimized Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear until empty or mismatch
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome ❌");
        }

        sc.close();
    }
}