package ARRAYS.misc.lect4;
import java.util.Scanner;

public class RotateArray {

    // Function to rotate the array by k steps
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than array length
        int[] ans = new int[n];
        int j = 0;

        // Copy last k elements to the start of ans[]
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy first (n-k) elements after that
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k (number of rotations): ");
        int k = sc.nextInt();

        // Call the rotate function
        int[] rotatedArray = rotate(arr, k);

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
//Enter the size of the array: 5
//Enter the array elements: 1 2 3 4 5
//Enter value of k (number of rotations): 2
//Rotated Array: 4 5 1 2 3
