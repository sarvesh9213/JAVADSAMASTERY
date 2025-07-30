package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class GeneralizedPattern {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            if (i != n) {
                // Print the first number
                System.out.print(i);

                if (i > 1) {
                    // Print middle spaces
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }

                    // Print the second number
                    System.out.print(i);
                }
            } else {
                // Last row: print the number 2*i - 1 times
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(i);
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}