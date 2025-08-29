package LETS_START_LOOPS.lec1babyloops;
public class SkipMultiplesOf3 {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 50) {
            if (num % 3 == 0) {
                num++; // skip multiples of 3
                continue; // ye bss aage ki iteration ko hilaa ker rkh deta hai
            }
            System.out.println(num);
            num++;
        }
    }
}

