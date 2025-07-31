package ARRAYS.lect_1_2_3;
class ArrayExample {
    void sumOfArray() {
        int[] arr = {4, 4, 5, 6, 1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.sumOfArray();
    }
}
