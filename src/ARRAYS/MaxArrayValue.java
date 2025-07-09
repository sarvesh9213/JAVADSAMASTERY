package ARRAYS;
public class MaxArrayValue {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 3};
        int max = arr[0]; // Assume first element is max initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
