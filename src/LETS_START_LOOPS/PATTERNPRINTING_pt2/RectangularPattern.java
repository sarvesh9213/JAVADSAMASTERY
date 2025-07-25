package LETS_START_LOOPS.PATTERNPRINTING_pt2;
import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(); // number of rows
        int c = sc.nextInt(); // number of columns

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*"); // print star without newline
            }
            System.out.println(); // move to next line after each row
        }

        sc.close();
    }
}
//Sample Input:
//4 5
//Output:
//markdown
//*****
//*****
//*****
//*****