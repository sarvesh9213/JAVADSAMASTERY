package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class NumberPatternWithSpaces {
    public static void main(String[] args) {
        int r = 5;

        for(int i = 1; i <= r; i++) {

            // Print numbers from i to r
            for(int j = i; j <= r; j++) {
                System.out.print(j + " ");
            }

            // Print numbers from 1 to i-1
            for(int k = 1; k <= i-1; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
//Pattern Explanation:
//Row 1: Print 1,2,3,4,5 + nothing = 12345
//
//Row 2: Print 2,3,4,5 + 1 = 23451
//
//Row 3: Print 3,4,5 + 1,2 = 34512
//
//Row 4: Print 4,5 + 1,2,3 = 45123
//
//Row 5: Print 5 + 1,2,3,4 = 51234
//
//        1 2 3 4 5
//        2 3 4 5 1
//        3 4 5 1 2
//        4 5 1 2 3
//        5 1 2 3 4
