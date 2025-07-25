package LETS_START_LOOPS.PATTERNPRINTING_pt2;
import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(); // number of rows
        int c = sc.nextInt(); // number of columns

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                // Print '*' for boundary cells, space for inner cells
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line
        }

        sc.close();
    }
}
//Sample Input:
//Copy code
//5 10
//Output:
//markdown
//Copy code
//        **********
//        *        *
//        *        *
//        *        *
//        **********