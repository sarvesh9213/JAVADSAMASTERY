package oopslect11_12_13.lecture_11.lecture_12.lect11;
import java.util.*; // Importing Scanner class

// Defining a class named Algebra
public class Algebra {

    int a; // Instance variable 1
    int b; // Instance variable 2

    // Constructor (automatically called when object is created)
    Algebra(int x, int y) {
        System.out.println("Constructor of Algebra class called");
        a = x;  // assigning parameter x to instance variable a
        b = y;  // assigning parameter y to instance variable b
    }

    // Method to add 'a' and 'b'
    int add() {
        int ans = a + b;
        return ans;
    }

    // Method to subtract 'b' from 'a'
    int sub() {
        return a - b;
    }

    // Method to multiply 'a' and 'b'
    int mul() {
        return a * b;
    }

    // Main method (program execution starts here)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // Creating first object of Algebra class
        Algebra obj1 = new Algebra(x, y);

        // Calling methods using the first object
        System.out.println("Addition = " + obj1.add());
        System.out.println("Subtraction = " + obj1.sub());
        System.out.println("Multiplication = " + obj1.mul());

        System.out.println("---------------------------------");

        // Creating another object to show constructor reusability
        Algebra obj2 = new Algebra(10, 7);

        // Calling methods using the second object
        System.out.println("Addition (obj2) = " + obj2.add());
        System.out.println("Subtraction (obj2) = " + obj2.sub());
        System.out.println("Multiplication (obj2) = " + obj2.mul());

        sc.close(); // closing the Scanner
    }
}
