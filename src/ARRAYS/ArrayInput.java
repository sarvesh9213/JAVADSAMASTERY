package ARRAYS;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Declare array of size 'n'
        int[] arr = new int[n];

        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output the array elements
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
