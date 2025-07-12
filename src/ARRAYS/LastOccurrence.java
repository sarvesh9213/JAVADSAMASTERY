package ARRAYS;
public class LastOccurrence {

    // Function to find the last index where x occurs in array
    public static int lastOccurrence(int[] arr, int x) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i; // keep updating to latest index
            }
        }

        return index; // -1 if x not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 3, 4};
        int x = 5;

        int result = lastOccurrence(arr, x); // this is how u call a function in the void main where all the java code begins!!!!!
        System.out.println("Last occurrence of " + x + ": " + result);
    }
}
