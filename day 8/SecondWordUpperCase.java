public class SecondWordUpperCase {
    public static void main(String[] args) {
        String input = "Hello, world! Welcome to Java programming.";
        String secondWord = getSecondWordInUpperCase(input);
        System.out.println("Second word in uppercase: " + secondWord);
    }

    public static String getSecondWordInUpperCase(String input) {
        String[] words = input.split("\\s+");
        
        if (words.length >= 2) {
            return words[1].toUpperCase();
        } else {
            throw new IllegalArgumentException("Input string does not contain at least two words.");
        }
    }
}
