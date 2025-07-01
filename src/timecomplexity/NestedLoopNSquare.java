package timecomplexity;
public class NestedLoopNSquare {
    public static void main(String[] args) {
        int n = 5; // You can change this value to test with other sizes

        // Outer loop runs from 0 to n-1 → runs n times
        for (int i = 0; i < n; i++) {
            // Inner loop also runs from 0 to n-1 → runs n times for each i
            for (int j = 0; j < n; j++) {
                // This statement runs n * n = n² times total
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Time Complexity: O(n²) because we are running two full loops of size n
    }
}
