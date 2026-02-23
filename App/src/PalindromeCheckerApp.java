public class PalindromeChecker {

    public static void main(String[] args) {

        // Hardcoded string
        String original = "level";
        String reversed = "";

        // Manually reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}