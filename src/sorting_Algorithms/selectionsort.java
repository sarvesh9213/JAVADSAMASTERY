package sorting_Algorithms;
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3};
        int n = arr.length;
        int i, j, min, temp;

        for (i = 0; i < n - 1; i++) {          // outer loop (har step pe ek element fix hoga)
            min = i;                           // assume current index is min

            for (j = i; j < n - 1; j++) {      // inner loop (aage ke elements se compare)
                if (arr[j + 1] < arr[min]) {   // agar chhota element mil gaya
                    min = j + 1;               // uska index store karlo
                }
            }

            // swap karo arr[i] aur arr[min]
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // print sorted array
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
