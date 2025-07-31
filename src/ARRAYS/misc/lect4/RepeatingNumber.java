package ARRAYS.misc.lect4;
public class RepeatingNumber {

    // Function to find the first repeating number
    static int firstRepeatingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) { // first number
            for (int j = i + 1; j < n; j++) { // second number
                if (arr[i] == arr[j]) { // found repeating number
                    return arr[i];
                }
            }
        }

        return -1; // no repeating number found
    }

    public static void main(String[] args) {
        // Sample input array
        int[] myArray = {4, 5, 6, 7, 5, 8, 9};

        // Call the function
        int result = firstRepeatingNumber(myArray);

        // Output the result
        if (result != -1) {
            System.out.println("First repeating number: " + result);
        } else {
            System.out.println("No repeating number found.");
        }
    }
}
