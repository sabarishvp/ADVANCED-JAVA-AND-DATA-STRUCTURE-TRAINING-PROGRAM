import java.util.Base64;

public class StringEncoder {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";
        String string3 = "Java";
        
        String encoded1 = encodeString(string1);
        String encoded2 = encodeString(string2);
        String encoded3 = encodeString(string3);
        
        System.out.println("Encoded String 1: " + encoded1);
        System.out.println("Encoded String 2: " + encoded2);
        System.out.println("Encoded String 3: " + encoded3);
    }
    
    private static String encodeString(String input) {
        byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
        return new String(encodedBytes);
    }
}
