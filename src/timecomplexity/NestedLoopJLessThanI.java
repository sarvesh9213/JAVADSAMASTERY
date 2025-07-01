package timecomplexity;
public class NestedLoopJLessThanI {
    public static void main(String[] args) {
        int n = 5; // Set the size of the problem

        // Outer loop runs from 0 to n-1 → runs n times
        for (int i = 0; i < n; i++) {
            // Inner loop runs from 0 to i-1 → varies with i
            for (int j = 0; j < i; j++) {
                // On average, inner loop runs n/2 times → still O(n²)
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Time Complexity: O(n²) because even though j < i,
        // the total number of iterations adds up to (n*(n-1))/2 ≈ O(n²)
    }
}
