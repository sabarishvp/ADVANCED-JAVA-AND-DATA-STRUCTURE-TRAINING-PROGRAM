public class AlternateAddSub {
    public static void main(String[] args) {
        int N = 10; // The initial number
        
        int result = alternateAddSub(N);
        
        System.out.println("Result after alternate add/sub operations: " + result);
    }
    
    private static int alternateAddSub(int N) {
        int result = 0;
        boolean add = true; // Flag to track whether to add or subtract
        
        for (int i = 1; i <= N; i++) {
            if (add) {
                result += i; // Add i to the result
            } else {
                result -= i; // Subtract i from the result
            }
            
            add = !add; // Toggle the flag for the next iteration
        }
        
        return result;
    }
}
