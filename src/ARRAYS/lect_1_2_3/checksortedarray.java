package ARRAYS.lect_1_2_3;
import java.util.Scanner;

public class checksortedarray {

    // Function to check if an array is sorted in increasing order
    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size input
        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        // Taking array input
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Checking if the array is sorted
        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }

        sc.close();
    }
}
//Enter number of elements (n): 5
//Enter 5 elements:
//        1 3 5 7 9
//The array is sorted.
//Enter number of elements (n): 4
//Enter 4 elements:
//        2 4 1 5
//The array is NOT sorted.
