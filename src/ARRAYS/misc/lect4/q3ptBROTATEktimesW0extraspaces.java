package ARRAYS.misc.lect4;
public class q3ptBROTATEktimesW0extraspaces {

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse function
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Rotate in place function
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle k > n

        // Step 1: Reverse first (n-k) elements
        reverse(arr, 0, n - k - 1);

        // Step 2: Reverse last k elements
        reverse(arr, n - k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotateInPlace(arr, k);

        System.out.println("\n\nArray after rotation by " + k + " steps:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

