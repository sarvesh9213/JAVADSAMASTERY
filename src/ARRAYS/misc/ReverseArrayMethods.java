package ARRAYS.misc;
public class ReverseArrayMethods {

    // Method 1: In-place reverse using for loop
    static void reverseWithFor(int[] arr) {
        System.out.println("Reversing with FOR loop (in-place):");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        printArray(arr);
    }

    // Method 2: In-place reverse using while loop
    static void reverseWithWhile(int[] arr) {
        System.out.println("Reversing with WHILE loop (in-place):");
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        printArray(arr);
    }

    // Method 3: Reverse using new array and j++
    static void reverseWithNewArray(int[] arr) {
        System.out.println("Reversing with new array and j++ (like teacher):");
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }
        printArray(ans);
    }

    // Helper function to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        // Clone the array for each method to avoid in-place conflict
        reverseWithFor(original.clone());
        reverseWithWhile(original.clone());
        reverseWithNewArray(original);
    }
}
