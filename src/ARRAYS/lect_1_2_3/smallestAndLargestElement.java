package ARRAYS.lect_1_2_3;
import java.util.*;  // Importing Arrays class and Scanner

public class smallestAndLargestElement {

    // Function to check if array is sorted
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Function to find smallest and largest elements
    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);  // Sorting array
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if sorted
        System.out.println("Is Sorted: " + isSorted(arr));

        // Find smallest and largest
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);

        sc.close();
    }
}
