package linkedlist.lect1;

public class basicsll {
    // Static inner class Node
    public static class Node {
        int data;     // stores the actual value
        Node next;    // stores the address of the next node

        Node(int data) {
            this.data = data;
            // Ye constructor sirf Node banate hi uske andar data store kar deta hai, jisse code clean aur short ho jaata hai.
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(58);
        Node e = new Node(16);

        // Example: linking nodes manually
        a.next = b; // stores the address of the next node
        b.next = c;
        c.next = d;
        d.next = e;

    }
}
