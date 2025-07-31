package ARRAYS.lect_1_2_3;
public class MultiArrayExample {

    public static void main(String[] args) {

        // 🔹 Method 1: Normal Way – Declare then Assign Values
        // Yahan 3 rows aur 3 columns ka array banaya gaya hai
        int[][] normalArray = new int[3][3];

        // Value assign kar rahe hain manually
        normalArray[0][0] = 1;
        normalArray[0][1] = 2;
        normalArray[0][2] = 3;

        normalArray[1][0] = 4;
        normalArray[1][1] = 5;
        normalArray[1][2] = 6;

        normalArray[2][0] = 7;
        normalArray[2][1] = 8;
        normalArray[2][2] = 9;

        // Output print karna using nested for loop
        System.out.println("🔹 Normal Way Output:");
        for (int i = 0; i < 3; i++) { // row loop
            for (int j = 0; j < 3; j++) { // column loop
                System.out.print(normalArray[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }

        // 🔹 Method 2: Literal Initialization
        // Direct array ke andar values daal diye hain
        int[][] literalArray = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };

        // Output print karna
        System.out.println("\n🔹 Literal Initialization Output:");
        for (int i = 0; i < literalArray.length; i++) {
            for (int j = 0; j < literalArray[i].length; j++) {
                System.out.print(literalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
