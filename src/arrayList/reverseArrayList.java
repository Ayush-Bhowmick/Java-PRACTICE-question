package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {
    static void reverse(ArrayList<Integer> l){
        int i = 0, j = l.size() - 1;
        while(i < j){
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
           // l.set(j, l.get(temp));   //[8, 7, 6, 5, 5, 6, 7, 8]
            l.set(j, temp);  //[8, 7, 6, 5, 3, 2, 1, 0]
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(0);
        l.add(10);
        l.add(2);
        l.add(3);
        l.add(50);
        l.add(6);
        l.add(7);
        l.add(8);
        //reverse(l);
        System.out.println(l);
        System.out.println("reverse  ");
        Collections.reverse(l);
        System.out.println(l);
        System.out.println("Ascending order ");
        Collections.sort(l);
        System.out.println(l);
        System.out.println("Descending order ");
        Collections.sort( l,  Collections.reverseOrder());
        System.out.println(l);

          //SORT

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Ayush");
        l2.add("Myush");
        l2.add("Dyush");
        l2.add("Uyush");
        l2.add("Tyush");
        l2.add("Eyush");

        System.out.println("og" + " ");
         Collections.sort(l2);
        System.out.println(l2);
        System.out.println("DESCENDING");
        Collections.sort(l2, Collections.reverseOrder());
        System.out.println(l2);
    }
}
