package timecomplexity;
public class LogTimeTraversal {
    public static void main(String[] args) {
        int n = 100; // You can change n to any number
        int count = 0; // Counter to count the number of iterations

        // Start from i = 1, multiply i by 2 in every step, until i < n
        for (int i = 1; i < n; i = i * 2) {
            // Print the current value of i and current count
            System.out.println("i = " + i + ", count = " + count);

            // Increase the count each time the loop runs
            count++;
        }

        // After the loop ends, print the total number of iterations
        System.out.println("Total steps (count): " + count);

        /*
         * ✅ Time Complexity: O(log n)
         *
         * 💡 Why?
         * On each iteration, i is doubled:
         * Iteration 1: i = 1
         * Iteration 2: i = 2
         * Iteration 3: i = 4
         * Iteration 4: i = 8
         * Iteration 5: i = 16
         * Iteration 6: i = 32
         * Iteration 7: i = 64
         * Iteration 8: i = 128 (loop ends here since i ≥ n = 100)
         *
         * So the number of steps is roughly:
         * log₂(n)
         * For n = 100, log₂(100) ≈ 6.64 ⇒ loop runs ~7 times
         *
         * Hence, Time Complexity: O(log n)
         */
    }
}
