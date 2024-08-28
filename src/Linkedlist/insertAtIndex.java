package Linkedlist;

public class insertAtIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        int size(){
            Node temp = head;
            int count=0;
            while (temp !=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
       void display(){
           Node temp = head;
           while (temp !=null){
               System.out.print(temp.data + " ");
               temp=temp.next;
           }
           System.out.println();
        }
        void deleteAt( int idx){
            Node temp=head;

            if (idx==0){         //head deletion
                temp=temp.next;
            return;
            };
            if (idx==size()-1){ //tail deletion
                tail=temp;
            return;
            };

            for (int i = 1; i <= idx-1 ; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        Node head=null;
        Node tail=null;
        void insertatend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
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
       void insertAtIndex(int val, int idx){
           Node t = new Node(val);
           if (idx == size()) { //insertatend
               insertatend(val);
               return;
           }else if(idx == 0){ //insertatBegining
              insertAtStart(val);
              return;
           }
           Node temp=head;
           for (int i = 0; i <=idx-1 ; i++) { // idx ekta kom karon jekhane index ache otr thik agey obdi jne
               temp=temp.next;
           }
           t.next=temp.next; //niye notun node r temp node same porer node ta k point korbe tahole dujon er link hoye glo
           temp.next=t;//ebr temp er link ta bhange notun er sathe jure dewa holo jetr naam t

       }
    }

    public static void main(String[] args) {
      linkedlist ll=new linkedlist();
      ll.insertAtIndex(5,0);
      ll.display();
        ll.insertAtIndex(6,0);
        ll.display();
        ll.insertAtIndex(9,0);
        ll.display();
        ll.insertAtIndex(5,1);
        ll.display();
        ll.deleteAt(2);
        ll.display();
    }
}
//output
//5
//6 5
//9 6 5
//9 6 5 5
//9 6 5
