public class HillPatternWeight {
    public static void main(String[] args) {
        int[][] pattern = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 0, 0, 0, 0, 1, 1},
            {1, 1, 1, 0, 0, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1}
        };

        int weight = calculatePatternWeight(pattern);
        System.out.println("Weight of the hill pattern: " + weight);
    }

    public static int calculatePatternWeight(int[][] pattern) {
        int weight = 0;
        
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                weight += pattern[i][j] * (i + 1);
            }
        }
        
        return weight;
    }
}
