package ARRAYS.misc;
public class SwappingMethods {

    // Method 1: Using a temporary variable
    static void swapUsingTemp(int a, int b) {
        System.out.println("Before swap (temp method): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (temp method): a = " + a + ", b = " + b);
    }

    // Method 2: Using arithmetic operations
    static void swapUsingArithmetic(int a, int b) {
        System.out.println("Before swap (arithmetic method): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (arithmetic method): a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 3, b = 5;

        // Call method 1
        swapUsingTemp(a, b);

        System.out.println();

        // Call method 2
        swapUsingArithmetic(a, b);
    }
}
//Before swap (temp method): a = 3, b = 5
//After swap (temp method): a = 5, b = 3
//
//Before swap (arithmetic method): a = 3, b = 5
//After swap (arithmetic method): a = 5, b = 3

