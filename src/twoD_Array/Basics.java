package twoD_Array;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        // Wrapper Class

//        Integer i =  Integer.valueOf(3);
//        System.out.println(i);
//
//        Float j = Float.valueOf(3.9j);
//        System.out.println(j);
//
//        Boolean k = Boolean.valueOf(String.valueOf(8)k);
//        System.out.println(k);


        ArrayList< Integer> l1 = new ArrayList<>();
       // ArrayList< Boolean> L2 = new ArrayList<>();
       // ArrayList< Float> L3 = new ArrayList<>();


        //add new element
l1.add(5);
l1.add(6);
l1.add(7);
l1.add(8);
l1.add(9);

        //get an element at index i

        System.out.println(l1.get(1));  //6
        System.out.println(l1.get(2));  //7
        System.out.println(l1.get(3));  //8

        // print with for loop
        for (int l = 0; l < l1.size(); l++) {
            System.out.print(l1.get(l) + " ");  // 5 6 7 8 9
        }
        System.out.println();

        //printing directly from array
        System.out.println(l1); //[5, 6, 7, 8, 9]

        //adding elements at some index i
        l1.add(1,100);
        System.out.println(l1);  //[5, 100, 6, 7, 8, 9]

        //modifying at index i ;
        l1.set(2,47);
        System.out.println(l1);  //[5, 100, 47, 7, 8, 9]

        //removing at element at index i
        l1.remove(4);
        System.out.println(l1);  //[5, 100, 47, 7, 9]

        // remove an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //check if exist
     Boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        Boolean ans1 = l1.contains(Integer.valueOf(9));
        System.out.println(ans1);

        //if u don't specify class u can put anything inside l

        ArrayList l = new ArrayList();
        l.add(1);
        l.add("ayush");
        l.add(true);
        l.add(8.8);
        System.out.println(l);

    }
}
