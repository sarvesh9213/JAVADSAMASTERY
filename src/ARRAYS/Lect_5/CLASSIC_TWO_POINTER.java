package ARRAYS.Lect_5;

public class CLASSIC_TWO_POINTER {

    // helper function to swap
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOneInPlace(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            // Case 1: if left is 1 and right is 0 -> swap
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            // Case 2: if left is already 0 -> just move left forward
            else if (arr[left] == 0) {
                left++;
            }
            // Case 3: if right is already 1 -> just move right backward
            else if (arr[right] == 1) {
                right--;
            }
        }
    }

    // test the function
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0};
        sortZeroesAndOneInPlace(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
