import java.util.ArrayList;
import java.util.List;

public class WordIdentifier {
    public static void main(String[] args) {
        String input = "aplceten";
        
        List<String> dictionary = new ArrayList<>();
        dictionary.add("apple");
        dictionary.add("cat");
        dictionary.add("net");
        dictionary.add("ten");
        
        List<String> possibleWords = identifyPossibleWords(input, dictionary);
        
        System.out.println("Possible words:");
        for (String word : possibleWords) {
            System.out.println(word);
        }
    }
    
    private static List<String> identifyPossibleWords(String input, List<String> dictionary) {
        List<String> possibleWords = new ArrayList<>();
        
        for (String word : dictionary) {
            if (isPossibleWord(input, word)) {
                possibleWords.add(word);
            }
        }
        
        return possibleWords;
    }
    
    private static boolean isPossibleWord(String input, String word) {
        int[] charCount = new int[26]; // Assuming input and words contain only lowercase letters
        
        // Count the frequency of characters in the input string
        for (char c : input.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Check if the characters of the word can be formed from the input string
        for (char c : word.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false; // Character not present in input string
            }
            charCount[c - 'a']--;
        }
        
        return true;
    }
}
