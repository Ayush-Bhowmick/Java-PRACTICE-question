package Linkedlist;

public class insertAtBegining {
   public static class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
       }
   }
   public static class linkedlist{

       void displayNode() {
           Node temp = head;
           while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
       }
       Node head=null;
       Node tail=null;
       
       void insertAtStart(int val){
           Node temp= new Node(val);
           if (head == null) {
               Node tempo = new Node(val);
               if (head == null) {
                   head = tempo;//temp keii head mene nii (jeta k mnbo ota agey r eii jinis tate value diye mnbo ota pore)
               } else {
                   tail.next = tempo;
               }
               tail = tempo;
           }else {
           temp.next=head;
               head=temp;
           }
       }
   }
    public static void main(String[] args) {
       linkedlist ll = new linkedlist();
        ll.insertAtStart(6);
        ll.insertAtStart(7);
        
        ll.displayNode();
    }
}
//7 6
