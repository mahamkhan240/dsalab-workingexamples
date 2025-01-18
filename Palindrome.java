public class Palindrome {
    public static void main(String[] args) {
        String a = "maham";
        boolean isPalindrome = true;

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome) {
            System.out.println(a + " is a palindrome.");
        }
        else {
            System.out.println(a + " is not a palindrome.");
        }
    }
}
