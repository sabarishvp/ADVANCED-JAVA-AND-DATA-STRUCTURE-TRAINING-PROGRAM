public class StringAddition {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String sum = addStrings(num1, num2);
        System.out.println("Sum: " + sum);
    }
    
    public static String addStrings(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = n1 + n2;
        return String.valueOf(result);
    }
}
