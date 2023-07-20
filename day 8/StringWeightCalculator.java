public class StringWeightCalculator {
    public static void main(String[] args) {
        String input = "Hello";
        int weight = calculateStringWeight(input);
        System.out.println("Weight of the string: " + weight);
    }
    
    public static int calculateStringWeight(String input) {
        int weight = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            weight += getCharacterWeight(ch);
        }
        
        return weight;
    }
    
    public static int getCharacterWeight(char ch) {
        // Assign weights to characters based on your desired criteria
        // Example weights: A-Z: 1-26, a-z: 27-52, space: 0
        if (ch >= 'A' && ch <= 'Z') {
            return ch - 'A' + 1;
        } else if (ch >= 'a' && ch <= 'z') {
            return ch - 'a' + 27;
        } else if (ch == ' ') {
            return 0;
        } else {
            // Assign a default weight for other characters if needed
            return 0;
        }
    }
}
