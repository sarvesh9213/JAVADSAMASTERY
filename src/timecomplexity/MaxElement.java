package timecomplexity;
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7, 6};
        int max = arr[0]; // Assume first element is max

        // Loop through array once -> O(n)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
