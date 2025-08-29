package LETS_START_LOOPS.lec1babyloops;

import java.util.Scanner;

public class StreamofNums {
    public static void main(String[] args) {
        Scanner scdd = new Scanner(System.in);

        int num = scdd.nextInt();
        int sum = 0;

        while (num != -1) {
            sum += num;   // add num to sum
            num = scdd.nextInt();  // take next number
        }

        System.out.println("Sum = " + sum);
    }
}
