import java.util.Random;

public class PinGenerator {
    private static final String ALPHA = "alpha";
    private static final String BETA = "beta";
    private static final String GAMMA = "gamma";
    
    public static void main(String[] args) {
        String pin = generatePin(6); // Change the length as needed
        System.out.println("Generated PIN: " + pin);
    }
    
    public static String generatePin(int length) {
        StringBuilder pinBuilder = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(3); // Generate a random number between 0 and 2
            char selectedChar;
            
            // Select the character based on the random index
            switch (randomIndex) {
                case 0:
                    selectedChar = ALPHA.charAt(random.nextInt(ALPHA.length()));
                    break;
                case 1:
                    selectedChar = BETA.charAt(random.nextInt(BETA.length()));
                    break;
                case 2:
                    selectedChar = GAMMA.charAt(random.nextInt(GAMMA.length()));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + randomIndex);
            }
            
            pinBuilder.append(selectedChar);
        }
        
        return pinBuilder.toString();
    }
}
