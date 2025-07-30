package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class NestedLoopExample {
    public static void main(String[] args) {
        int r = 5; // number of rows
        int c = 4; // number of columns

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
