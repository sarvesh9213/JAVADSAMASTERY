package LETS_START_LOOPS.PATTERNPRINTING_pt2;
public class NumberTriangle {
    public static void main(String[] args) {
        int r = 5;

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=54574" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sarve\IdeaProjects\JAVADSAMASTERY\out\production\JAVADSAMASTERY LETS_START_LOOPS.PATTERNPRINTING_pt2.NumberTriangle
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//
//Process finished with exit code 0
