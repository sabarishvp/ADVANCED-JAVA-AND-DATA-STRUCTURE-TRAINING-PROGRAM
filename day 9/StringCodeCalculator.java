public class StringCodeCalculator {
    public static void main(String[] args) {
        String input = "Hello";
        int stringCode = calculateStringCode(input);
        System.out.println("Code of the string: " + stringCode);
    }

    public static int calculateStringCode(String input) {
        int code = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            code += (int) ch;
        }

        return code;
    }
}
