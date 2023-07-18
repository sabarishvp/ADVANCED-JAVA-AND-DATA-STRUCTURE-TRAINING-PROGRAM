public class PalindromeDigitRemoval {
    public static void main(String[] args) {
        int number = 1234321; // Sample input number
        
        int digitToRemove = findDigitToRemove(number);
        
        if (digitToRemove != -1) {
            System.out.println("Remove digit: " + digitToRemove);
        } else {
            System.out.println("No digit can be removed to form a palindrome.");
        }
    }
    
    private static int findDigitToRemove(int number) {
        String strNumber = String.valueOf(number);
        
        for (int i = 0; i < strNumber.length(); i++) {
            StringBuilder sb = new StringBuilder(strNumber);
            sb.deleteCharAt(i); // Remove the digit at index i
            
            if (isPalindrome(sb.toString())) {
                return Character.getNumericValue(strNumber.charAt(i));
            }
        }
        
        return -1; // No digit can be removed to form a palindrome
    }
    
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
