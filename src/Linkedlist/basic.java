package Linkedlist;

public class basic {
     public static class Node{
         int data; //value
         Node next;//address
         Node(int data){ //constructor
             this.data=data;
         }
     }
    public static void main(String[] args) {
         //creating node
        Node a= new Node(3);
        System.out.println(a);
        Node b= new Node(6);
        Node c= new Node(9);
        Node d= new Node(2);
        Node e= new Node(7);

        System.out.println(a.data); //3
        System.out.println(b.data); //6
        //linking node
        a.next=b; //3 -> 6 9 2 7
        b.next=c; //3 -> 6 -> 9 2 7
        c.next=d; //3 -> 6 -> 9 -> 2 7
        d.next=e; //3 -> 6 -> 9 -> 2 -> 7
        System.out.println(a.next.data);//6 /// b er data print holo
        System.out.println(a.next.next.next.data); //2

    }
}
