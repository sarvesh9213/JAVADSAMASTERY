package linkedlist.lect1;

public class basicsll {
    public static class Node {
    int data ; // stores the actual value
    Node next ; // stores the address of the next node
    }

    public static void main(String[] args) {
        Node x = new Node() ;
        System.out.println(x); // linkedlist.lect1.basicsll$Node@30f39991
        System.out.println(x.data); //0
        System.out.println(x.next); //null
    }
}
