package ALLLOOPS ;
import java.util.Scanner;

public class SUMOFDIGITS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
