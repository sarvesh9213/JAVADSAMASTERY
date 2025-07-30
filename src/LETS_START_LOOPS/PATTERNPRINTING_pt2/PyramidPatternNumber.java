package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class PyramidPatternNumber {
    public static void main(String[] args) {
        int r = 5;

        for(int i = 1; i <= r; i++){
            //print r-i spaces
            for(int j = 1; j <= r-i; j++){
                System.out.print(" ");
            }

            //print 1 to i
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }

            //print i-1 to 1
            for(int l = i-1; l >= 1; l--){
                System.out.print(l);
            }

            System.out.println();
        }
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=54763" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sarve\IdeaProjects\JAVADSAMASTERY\out\production\JAVADSAMASTERY LETS_START_LOOPS.PATTERNPRINTING_pt2.PyramidPatternNumber
//                1
//               121
//              12321
//             1234321
//            123454321
//
//Process finished with exit code 0
