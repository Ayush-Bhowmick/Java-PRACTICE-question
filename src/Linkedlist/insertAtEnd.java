package Linkedlist;

public class insertAtEnd {
    public insertAtEnd(int val) {

    }

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {

        int size(){
            Node temp = head;
             int count=0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        void displayNode() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        Node head = null;
        Node tail = null;

        void insertatend(int val) {  //t.c-O(n)
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtEnd(Node head,  int val){ // at end head diye banano holo  t.c-O(1)
            Node temp= new Node(val);
            Node t=head;
            while (t.next!=null){ //tail a pouchalo
                t=t.next;
            }
            t.next=temp;// last a connect kore dilm temp er sathe
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatend(4);
        ll.insertatend(7);
        ll.insertatend(9);
        ll.displayNode();//4 7 9
        System.out.println();
        System.out.println( ll.size());//3
        ll.insertAtEnd(ll.head,5);
        ll.displayNode();// 4 7 9 5
    }
}
//output
//4 7 9
//        3
//              4 7 9 5

