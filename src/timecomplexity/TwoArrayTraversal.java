package timecomplexity;
public class TwoArrayTraversal {
    public static void main(String[] args) {
        // Declare and initialize the first array
        int[] array1 = {1, 2, 3}; // This array has 3 elements (m = 3)

        // Declare and initialize the second array
        int[] array2 = {10, 20, 30, 40}; // This array has 4 elements (n = 4)

        // Traverse the first array using a for loop
        for (int i = 0; i < array1.length; i++) {
            // Print each element of array1 with its index
            System.out.println("array1[" + i + "] = " + array1[i]);
        }

        // Traverse the second array using another for loop
        for (int j = 0; j < array2.length; j++) {
            // Print each element of array2 with its index
            System.out.println("array2[" + j + "] = " + array2[j]);
        }
    }
}
