package timecomplexity;
public class NestedLoopSqrtN {
    public static void main(String[] args) {
        int n = 16; // You can choose any number here

        // Outer loop runs from 0 to n-1 → runs n times
        for (int i = 0; i < n; i++) {
            // Inner loop runs from 0 to sqrt(n) - 1 → fixed for each i
            for (int j = 0; j < Math.sqrt(n); j++) {
                // This runs n * sqrt(n) times
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Time Complexity: O(n * √n)
    }
}
