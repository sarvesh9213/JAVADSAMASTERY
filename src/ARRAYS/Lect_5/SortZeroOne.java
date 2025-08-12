package ARRAYS.Lect_5;
public class SortZeroOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};

        int n = arr.length;
        int zeroes = 0;

        // Count the number of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        // Fill the array: first zeroes are 0, rest are 1
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        // Print the sorted array
        System.out.print("Sorted: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
//"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=64983" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\sarve\IdeaProjects\JAVADSAMASTERY\out\production\JAVADSAMASTERY ARRAYS.Lect_5.SortZeroOne
//Sorted: 0 0 0 0 1 1 1 1
//Process finished with exit code 0
