package sorting_Algorithms;
public class insertionsort {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 1, 2};
        insertionSort(a);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;

        // Outer loop starts from the second element
        for (int i = 1; i < n; i++) {

            // Inner loop to compare and insert a[i] at the correct position
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    // Swap a[j] and a[j - 1]
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    // If already in order, stop checking further
                    break;
                }
            }
        }
    }
}

