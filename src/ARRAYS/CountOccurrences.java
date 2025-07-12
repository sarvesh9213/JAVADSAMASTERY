package ARRAYS;
public class CountOccurrences {

    // Function to count how many times x occurs in the array
    public static int countOccurrences(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 3, 4};
        int x = 5;

        int result = countOccurrences(arr, x);
        System.out.println("Count of " + x + ": " + result);
    }
}
