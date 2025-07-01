package timecomplexity;
public class SingleArrayTraversal {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] array = {10, 20, 30, 40, 50}; // This array has 5 elements (n = 5)

        // Start a loop from index 0 to the last index of the array
        for (int i = 0; i < array.length; i++) {
            // Print the current element at index i
            System.out.println("Element at index " + i + " is " + array[i]);
        }
    }
}
