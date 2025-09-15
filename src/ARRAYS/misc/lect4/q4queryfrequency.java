package ARRAYS.misc.lect4;
import java.util.Scanner;

public class q4queryfrequency {

    // Function to make frequency array
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005]; // size large enough for given input range

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build frequency array
        int[] freq = makeFrequencyArray(arr);

        // Input queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();

            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            q--;
        }

        sc.close();
    }
}
