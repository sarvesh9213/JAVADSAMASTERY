package ARRAYS.misc.lect4;
import java.util.Scanner;

public class INPLACEREVERSE {

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse function using swap
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Reverse only between given indices using rotateInPlace
    static void rotateInPlace(int[] arr, int start, int end) {
        reverse(arr, start, end);
    }

    // Print array function
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input start and end indices
        System.out.print("Enter the starting index of subarray to reverse: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index of subarray to reverse: ");
        int end = sc.nextInt();

        // Show original
        System.out.println("Original Array:");
        printArray(arr);

        // Reverse between indices
        rotateInPlace(arr, start, end);

        // Show updated
        System.out.println("Array after reversing from index " + start + " to " + end + ":");
        printArray(arr);

        sc.close();
    }
}
//Enter the size of array: 7
//Enter the array elements: 1 2 3 4 5 6 7
//Enter the starting index of subarray to reverse: 2
//Enter the ending index of subarray to reverse: 5
//Original Array:
//        1 2 3 4 5 6 7
//Array after reversing from index 2 to 5:
//        1 2 6 5 4 3 7
