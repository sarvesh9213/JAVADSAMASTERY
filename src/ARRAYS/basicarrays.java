package ARRAYS;

public class basicarrays {
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Float array
        float[] prices = {10.5f, 20.75f, 30.0f, 40.25f};

        // Print integer array
        System.out.println("Integer array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Print float array
        System.out.println("\nFloat array:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices[" + i + "] = " + prices[i]);
        }
    }
}

//output Integer array:
//numbers[0] = 10
//numbers[1] = 20
//numbers[2] = 30
//numbers[3] = 40
//numbers[4] = 50
//
//Float array:
//prices[0] = 10.5
//prices[1] = 20.75
//prices[2] = 30.0
//prices[3] = 40.25
