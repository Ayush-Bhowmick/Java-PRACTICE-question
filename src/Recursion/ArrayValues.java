package Recursion;

import java.util.Scanner;

public class ArrayValues {

    static  void printValues( int[] arr, int idx ){  //5 6 7 8
        int n = arr.length;
         if (idx == n ){
             return;
         }
         //self work
        System.out.println(arr[idx]); //5

         //recursive work
         printValues(arr, idx+1 );  // 6 7 8

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        int[] arr = {5, 6, 7, 8};
//    for( int i = 0; i <= arr.length ; i++)    {
//        arr[i] = sc.nextInt();
//    }
//         int idx=sc.nextInt();

       printValues(arr, 0);  // 0 theke start kore sob
    }
}
