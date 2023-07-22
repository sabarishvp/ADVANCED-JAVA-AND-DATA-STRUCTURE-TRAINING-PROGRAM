public class SumOfPowers {
    public static void main(String[] args) {
        int number = 12345; // Sample input number
        int power = 2; // Power to raise each digit
        
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10; // Extract the rightmost digit
            sum += Math.pow(digit, power); // Calculate the power of the digit and add to the sum
            number /= 10; // Remove the rightmost digit from the number
        }
        
        System.out.println("Sum of powers: " + sum);
    }
}
