package array.java;

import java.util.Scanner;

public class freqArray_QUERYcheck {
    static int[] frequencyArray(int[] arr){
        int[] freq = new int[100010];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++; // corresponding frequency array te value increase kore dite hbe
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of elements :  ");
         int n=sc.nextInt();
         int[] arr = new int[n];
        System.out.println("ENTER the no of elements :  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = frequencyArray(arr);

        System.out.print("ENTER the no of QUERIES:  ");
         int q =sc.nextInt();

         while (q > 0){
             System.out.print("ENTER THE NUMBER TO BE SEARCHED :  ");
              int x =sc.nextInt();
             if (freq[x] > 0) {
                 System.out.println("Yes");
             }else{
                 System.out.println("NO");
             }
             q--;
         }
    }
}
       //OUTPUT

//    Enter the no of elements :  5
//        ENTER the no of elements :
//        47 62 94 51 87
//        ENTER the no of QUERIES:  5
//        ENTER THE NUMBER TO BE SEARCHED :  75
//        NO
//        ENTER THE NUMBER TO BE SEARCHED :  62
//        Yes
//        ENTER THE NUMBER TO BE SEARCHED :  47
//        Yes
//        ENTER THE NUMBER TO BE SEARCHED :  87
//        Yes
//        ENTER THE NUMBER TO BE SEARCHED :  58
//        NO
