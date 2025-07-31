package ARRAYS.lect_1_2_3;
public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 6, 2, 1, 3};
        int x = 2;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;  // Save index
                break;    // Exit loop if found // so no chance of the finding the next index
            }
        }

        if (ans == -1) { // sarvesh note this is out of the for loop // mtlb ans ki value global ho jaayegyi not consiced to only for loop
            System.out.println("Not Found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }
}
