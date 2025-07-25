package LETS_START_LOOPS.PATTERNPRINTING_pt2;
import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();  // number of rows

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line
        }

        sc.close();
    }
}
//Example
//Input:
//5
//Output:

//        *
//        **
//        ***
//        ****
//        *****