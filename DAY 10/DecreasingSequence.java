public class DecreasingSequence {
    public static void main(String[] args) {
        int start = 10;
        int end = 1;
        
        printDecreasingSequence(start, end);
    }
    
    public static void printDecreasingSequence(int start, int end) {
        if (start <= end) {
            System.out.println("Invalid input: start value should be greater than end value.");
            return;
        }
        
        for (int i = start; i >= end; i--) {
            System.out.print(i + " ");
        }
    }
}
