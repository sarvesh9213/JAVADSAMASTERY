package ARRAYS.lect_1_2_3;

public class ARRAYREFRENCE {

    // Function to print array elements
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For a new line after printing array
    }

    public static void main(String[] args) {
        // Original array with values
        int[] arr = {5, 6, 7, 8, 9};

        // Attempting to copy arr to arr2 (Note: this is a reference copy)
        int[] arr2 = arr;

        // Print copied array
        System.out.println("Copied Array:");
        printArray(arr2);

        // Changing some values in arr2
        arr2[0] = 0;
        arr2[1] = 0;

        // Print original array after changes
        System.out.println("Original Array:");
        printArray(arr);

        // Print arr2 after modification
        System.out.println("Modified Copied Array:");
        printArray(arr2);
    }
}

