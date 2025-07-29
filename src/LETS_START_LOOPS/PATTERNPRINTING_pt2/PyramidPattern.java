package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class PyramidPattern {
    public static void main(String[] args) {
        int r = 6;

        for(int i = 1; i <= r; i++) { // traversing over rows

            // print r-i spaces
            for(int j = 1; j <= r-i; j++) { // Fixed: was "j <= r-D"
                System.out.print(" ");
            }

            // print 2*i - 1 stars
            for(int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

//                *
//               ***
//              *****
//             *******
//            *********
//           ***********
//                !!
// christmas tree ben geyaaa :)