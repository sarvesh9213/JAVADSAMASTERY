package ARRAYS.Lect_5;
public class Q2twoppointer_even_odd {

    static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            // Case 1: left is odd & right is even -> swap
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            // Case 2: if left is already even -> move forward
            else if (arr[left] % 2 == 0) {
                left++;
            }
            // Case 3: if right is already odd -> move backward
            else if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    // helper swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // test function
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 7, 6, 9, 8};
        sortArrayByParity(arr);

        System.out.print("Sorted by Parity: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
