package timecomplexity;
public class LogKTimeTraversal {
    public static void main(String[] args) {
        int n = 1000; // You can change this to any large number
        int k = 3;    // Random multiplication factor (must be > 1)
        int count = 0; // To count number of steps

        // Start loop with i = 1, and multiply by k each time
        for (int i = 1; i < n; i = i * k) {
            // Print current step
            System.out.println("i = " + i + ", count = " + count);

            // Increment count to keep track of how many times the loop runs
            count++;
        }

        // Print total steps after loop ends
        System.out.println("Total steps: " + count);

        /*
         * ✅ Time Complexity: O(logₖ n)
         * Where:
         *    n = size limit (e.g. 1000)
         *    k = multiplication factor (e.g. 3)
         *
         * 💡 How?
         * Every time we multiply i by k, so:
         *    i = 1, k, k^2, k^3, ..., k^x
         * Stop when: k^x >= n
         * => x = logₖ(n)
         *
         * Example:
         *    n = 1000, k = 3
         *    k^0 = 1
         *    k^1 = 3
         *    k^2 = 9
         *    k^3 = 27
         *    k^4 = 81
         *    k^5 = 243
         *    k^6 = 729
         *    k^7 = 2187 (loop stops here)
         *
         * So total iterations ≈ 7 steps ⇒ O(log₃ n)
         */
    }
}
//Variable	Meaning
//n	Maximum limit
//k	Multiplier at each step
//i *= k	Growth by factor of k
//Steps	Until i ≥ n, so ≈ logₖ n
//Time	O(logₖ n)

