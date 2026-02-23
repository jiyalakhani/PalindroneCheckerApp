class PalindromeChecker {

    public static void main(String[] args) {

        // Hardcoded string
        String str = "pranav";

        int length = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}