package ARRAYS.Lect_5;

public class SortZeroesAndOneInPlace {
    // Remove this line:
// package ARRAYS.Lect_5;

    static void sortZeroesAndOneInPlace(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            // Skip all 0s from left side
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Skip all 1s from right side
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap if needed
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        printArray(arr);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        System.out.print("Original: ");
        printArray(arr);

        sortZeroesAndOneInPlace(arr);
    }

}
