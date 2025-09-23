package oopslect11_12_13.lecture_11.lecture_12;
import java.util.Scanner;

class Algebra {
    // 1st usage: define a method
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of Algebra
        Algebra obj = new Algebra();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // input first number
        int y = sc.nextInt(); // input second number

        System.out.println("Sum of input numbers is:");

        // 2nd usage: call the method
        int ans = obj.add(x, y);

        System.out.println(ans);
    }
}
