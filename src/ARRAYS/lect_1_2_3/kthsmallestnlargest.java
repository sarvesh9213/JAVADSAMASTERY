package ARRAYS.lect_1_2_3;


import java.util.*;

public class  kthsmallestnlargest{

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

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Check if k is valid
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k!");
        } else {
            // Sort the array
            Arrays.sort(arr);

            int kthSmallest = arr[k - 1];
            int kthLargest = arr[arr.length - k];

            System.out.println("Kth Smallest: " + kthSmallest);
            System.out.println("Kth Largest: " + kthLargest);
        }

        sc.close();
    }
}

