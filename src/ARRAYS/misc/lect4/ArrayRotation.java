package ARRAYS.misc.lect4;
import java.util.Arrays;

public class ArrayRotation {

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        // Copy elements from position (n-k) to end
        for(int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Copy elements from start to position (n-k-1)
        for(int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;

        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Rotating by " + k1 + " positions");
        int[] rotated1 = rotate(arr1, k1);
        System.out.println("Rotated array: " + Arrays.toString(rotated1));
        System.out.println();

        // Test case 2
        int[] arr2 = {-1, -100, 3, 99};
        int k2 = 2;

        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Rotating by " + k2 + " positions");
        int[] rotated2 = rotate(arr2, k2);
        System.out.println("Rotated array: " + Arrays.toString(rotated2));
        System.out.println();

        // Test case 3 - k greater than array length
        int[] arr3 = {1, 2, 3};
        int k3 = 4;

        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("Rotating by " + k3 + " positions");
        int[] rotated3 = rotate(arr3, k3);
        System.out.println("Rotated array: " + Arrays.toString(rotated3));
        System.out.println();

        // Test case 4 - edge case with single element
        int[] arr4 = {42};
        int k4 = 1;

        System.out.println("Original array: " + Arrays.toString(arr4));
        System.out.println("Rotating by " + k4 + " positions");
        int[] rotated4 = rotate(arr4, k4);
        System.out.println("Rotated array: " + Arrays.toString(rotated4));
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=54604" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sarve\IdeaProjects\JAVADSAMASTERY\out\production\JAVADSAMASTERY ARRAYS.misc.lect4.ArrayRotation
//Original array: [1, 2, 3, 4, 5, 6, 7]
//Rotating by 3 positions
//Rotated array: [5, 6, 7, 1, 2, 3, 4]
//
//Original array: [-1, -100, 3, 99]
//Rotating by 2 positions
//Rotated array: [3, 99, -1, -100]
//
//Original array: [1, 2, 3]
//Rotating by 4 positions
//Rotated array: [3, 1, 2]
//
//Original array: [42]
//Rotating by 1 positions
//Rotated array: [42]
//
//Process finished with exit code 0
