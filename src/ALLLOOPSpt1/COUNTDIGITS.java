package ALLLOOPSpt1;
import java.util.Scanner;

public class COUNTDIGITS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}

