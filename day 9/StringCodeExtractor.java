public class StringCodeExtractor {
    public static void main(String[] args) {
        String input = "Hello";
        int[] codes = getStringCodes(input);
        
        System.out.println("Codes of the string:");
        for (int code : codes) {
            System.out.println(code);
        }
    }
    
    public static int[] getStringCodes(String input) {
        int[] codes = new int[input.length()];
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            codes[i] = (int) ch;
        }
        
        return codes;
    }
}
