public class SeriesGenerator {
    public static void main(String[] args) {
        int n = 10; // The desired position in the series
        
        long nthElement = fibonacciSeries(n);
        
        System.out.println("The " + n + "th element in the Fibonacci series is: " + nthElement);
    }
    
    private static long fibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        
        long prev = 0;
        long current = 1;
        long next = 0;
        
        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }
        
        return current;
    }
}
