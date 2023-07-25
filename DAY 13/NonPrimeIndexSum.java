public class NonPrimeIndexSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sum = calculateNonPrimeIndexSum(array);
        
        System.out.println("Sum of non-prime index values: " + sum);
    }
    
    private static int calculateNonPrimeIndexSum(int[] array) {
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (!isPrime(i)) {
                sum += array[i];
            }
        }
        
        return sum;
    }
    
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
