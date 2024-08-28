package Linkedlist;

public class displayNode {
    public static class Node{
        int data;
        Node next;
        Node( int data){
            this.data=data;
        }
    }

    public static void displayNode(Node head){
        if (head==null) return;

        System.out.print(head.data +" ");
        displayNode(head.next);
    }
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(6);
        Node c= new Node(5);
        Node d= new Node(9);
        Node e= new Node(34);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        displayNode(a);
    }
}
//3 6 5 9 34
