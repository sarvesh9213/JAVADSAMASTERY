package ARRAYS.Lect_5;
public class Q3SortedSquares {

    // Function to return sorted squares of array
    public static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1;   // Fill from the end

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                right--;
            }
            k--;
        }

        return ans;
    }

    // Function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {-10, -4, -3, -2, 0, 1, 5, 9, 10};

        int[] ans = sortSquares(arr);

        System.out.print("Sorted Array of Squares: ");
        printArray(ans);
    }
}
