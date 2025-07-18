package ARRAYS;
import java.util.Scanner;

public class FindUnique {

    // Function to find the unique element
    public static int findUnique(int[] arr, int n) {
        // Mark duplicate pairs as -1
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        // Return the element which is not -1
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return arr[i];
            }
        }

        return -1; // If no unique element is found
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function and print result
        int unique = findUnique(arr, n);

        if (unique != -1) {
            System.out.println("Unique element is: " + unique);
        } else {
            System.out.println("No unique element found.");
        }

        sc.close();
    }
}
