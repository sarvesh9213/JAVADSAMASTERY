package ARRAYS;

public class ARRAYREFERENCEBEHAVIOR {

    // Ye function array ka har element 0 kar deta hai
    static void change_array(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;  // Har element ko 0 se replace kar rahe hain
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];  // 3 size ka array banaya

        arr[0] = 5;  // Pehla element 5
        arr[1] = 6;  // Doosra element 6
        arr[2] = 7;  // Teesra element 7

        change_array(arr);  // Function call kiya jo array ke sab elements ko 0 karega

        // Ab array print kar rahe hain
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);  // Har element ko print karenge
        }
    }
}
