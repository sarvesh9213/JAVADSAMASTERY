package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class CheckerboardPattern {
    public static void main(String[] args) {
        int r = 5; // number of rows
        int c = 6; // number of columns

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println(); // Move this outside the inner loop
        }
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=54531" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sarve\IdeaProjects\JAVADSAMASTERY\out\production\JAVADSAMASTERY LETS_START_LOOPS.PATTERNPRINTING_pt2.CheckerboardPattern
//        1 2 1 2 1 2
//        2 1 2 1 2 1
//        1 2 1 2 1 2
//        2 1 2 1 2 1
//        1 2 1 2 1 2
//
//Process finished with exit code 0