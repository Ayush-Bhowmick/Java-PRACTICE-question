package Linkedlist;

public class reverselinkedlist {

    public static class Node{
        int data;
        Node next;
        Node( int data){
            this.data=data;
        }
    }
    public static void displayreversell(Node head){
        if (head==null) return;

        displayreversell(head.next);
        System.out.print(head.data +" ");

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

        displayreversell(a);

    }
}
//34 9 5 6 3 
