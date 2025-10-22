package sorting_Algorithms.dsaquestions;
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 10, 5, 0, 4};
        int n = arr.length;

        // Bubble-like approach to move zeros to the end
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the array after moving zeroes
        System.out.print("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
