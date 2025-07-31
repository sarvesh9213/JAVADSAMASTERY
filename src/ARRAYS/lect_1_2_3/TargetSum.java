package ARRAYS.lect_1_2_3;
import java.util.Scanner;

public class TargetSum {

    // Function to count pairs with sum = target
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { // first number
            for (int j = i + 1; j < n; j++) { // second number
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    // Function to count triplets with sum = target
    static int tripletSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { // first number
            for (int j = i + 1; j < n; j++) { // second number
                for (int k = j + 1; k < n; k++) { // third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum (X): ");
        int target = sc.nextInt();

        // Function calls
        int totalPairs = pairSum(arr, target);
        int totalTriplets = tripletSum(arr, target);

        // Output results
        System.out.println("Number of pairs with sum = " + target + " : " + totalPairs);
        System.out.println("Number of triplets with sum = " + target + " : " + totalTriplets);
    }
}
