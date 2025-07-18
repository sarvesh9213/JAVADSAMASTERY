package ARRAYS;
import java.util.Scanner;

public class SecondLargest {

    // Method to find the maximum element in the array
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        return mx;
    }

    // Method to find the second maximum element
    static int findSecondMax(int[] arr) {
        int mx = findMax(arr);

        // Replace all occurrences of the maximum with Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        // Now find the next maximum, which is second largest
        int secondMax = findMax(arr);
        return secondMax;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Save a copy before modification for second max
        int[] arrCopy = arr.clone();

        // Find and print max
        int max = findMax(arr);
        System.out.println("Maximum element is: " + max);

        // Find and print second max
        int secondMax = findSecondMax(arrCopy);
        System.out.println("Second maximum element is: " + secondMax);

        sc.close();
    }
}
