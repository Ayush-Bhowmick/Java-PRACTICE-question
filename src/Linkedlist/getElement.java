package Linkedlist;

public class getElement {
    public static class Node {
        int data; //value
        Node next;//address

        Node(int data) { //constructor
            this.data = data;
        }
    }

    public static class linkedlist {

        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        int getElement( int idx){
            Node temp=head;
            for (int i = 1; i <= idx ; i++) {
                temp=temp.next;
            }
            return temp.data;
}
        public static void main(String[] args) {
            linkedlist ll= new linkedlist();
            ll.insertAtEnd(3);
            ll.insertAtEnd(7);
            ll.insertAtEnd(9);
            ll.insertAtEnd(2);
            ll.insertAtEnd(5);
            ll.display();
            System.out.println(ll.getElement(3) );

        }
    }
}
//3 7 9 2 5
//2
