package ALLLOOPSpt1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of factorials to print: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}
