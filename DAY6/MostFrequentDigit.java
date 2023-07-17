public class MostFrequentDigit {
    public static void main(String[] args) {
        int number = 1223334444;
        int mostFrequentDigit = findMostFrequentDigit(number);
        System.out.println("Most frequent digit: " + mostFrequentDigit);
    }
    
    public static int findMostFrequentDigit(int number) {
        String numberStr = String.valueOf(number);
        int[] digitCount = new int[10]; // Array to store the count of each digit (0-9)
        
        // Count the frequency of each digit
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            digitCount[digit]++;
        }
        
        int maxCount = 0;
        int mostFrequentDigit = 0;
        
        // Find the digit with the highest frequency
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > maxCount) {
                maxCount = digitCount[i];
                mostFrequentDigit = i;
            }
        }
        
        return mostFrequentDigit;
    }
}
