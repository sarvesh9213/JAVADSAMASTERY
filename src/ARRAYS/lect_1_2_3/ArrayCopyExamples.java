package ARRAYS.lect_1_2_3;
import java.util.Arrays;

public class ArrayCopyExamples {

    // Shallow Copy Example
    public static void shallowCopyExample() {
        int[] arr1 = {5, 6, 7, 8, 9};
        int[] arr2 = arr1; // Shallow copy: same reference

        arr2[0] = 0; // Modifies both arr1 and arr2

        System.out.println("Shallow Copy Output:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }

    // Deep Copy using clone()
    public static void deepCopyUsingClone() {
        int[] arr1 = {5, 6, 7, 8, 9};
        int[] arr2 = arr1.clone(); // Deep copy

        arr2[0] = 0; // arr1 remains unaffected

        System.out.println("Deep Copy using clone():");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }

    // Deep Copy using Arrays.copyOf()
    public static void copyUsingArrayCopyOf() {
        int[] arr1 = {5, 6, 7, 8, 9};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        arr2[0] = 0;

        System.out.println("Copy using Arrays.copyOf():");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }

    // copyOfRange Part A: Full copy
    public static void copyOfRangeFull() {
        int[] arr = {5, 6, 7, 8, 9};
        int[] copy = Arrays.copyOfRange(arr, 0, arr.length);

        System.out.println("copyOfRange (0 to arr.length): " + Arrays.toString(copy));
    }

    // copyOfRange Part B: Partial range
    public static void copyOfRangePartial() {
        int[] arr = {5, 6, 7, 8, 9};
        int[] copy = Arrays.copyOfRange(arr, 1, 4); // index 1 to 3

        System.out.println("copyOfRange (1 to 4): " + Arrays.toString(copy));
    }

    public static void main(String[] args) {
        shallowCopyExample();
        deepCopyUsingClone();
        copyUsingArrayCopyOf();
        copyOfRangeFull();
        copyOfRangePartial();
    }
}
