package LETS_START_LOOPS.PATTERNPRINTING_pt2;

import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();  // number of rows

        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }

        sc.close();
    }
}
//🧾 Example
//Input:
//5
//Output:
//        *****
//        ****
//        ***
//        **
//        *