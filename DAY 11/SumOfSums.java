public class SumOfSums {
    public static void main(String[] args) {
        int number = 12345; // Sample input number
        int rotations = String.valueOf(number).length(); // Number of cyclic rotations
        
        int sum = 0;
        
        for (int i = 0; i < rotations; i++) {
            sum += calculateSumOfDigits(number); // Calculate the sum of digits
            number = rotateDigits(number); // Rotate the digits
        }
        
        System.out.println("Sum of sums: " + sum);
    }
    
    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10; // Extract the rightmost digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the rightmost digit from the number
        }
        
        return sum;
    }
    
    private static int rotateDigits(int number) {
        int lastDigit = number % 10; // Extract the rightmost digit
        number = number / 10; // Remove the rightmost digit
        number = (int) (lastDigit * Math.pow(10, String.valueOf(number).length()) + number); // Rotate the digits
        
        return number;
    }
}
