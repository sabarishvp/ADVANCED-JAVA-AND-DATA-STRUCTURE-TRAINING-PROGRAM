public class PalindromestringChecker {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
        
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
