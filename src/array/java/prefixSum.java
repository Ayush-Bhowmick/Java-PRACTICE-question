// given an integer array "a" return the prefix sum/running sum in the same array without creating a new ARRAY

package array.java;

import java.util.Scanner;

public class prefixSum {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    //with creating a new array
    static int[] makePrefixSumArray(int[] arr){
         int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    //withOUT creating a new array
    static int[] makePrefixSUMArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1] ;
        }
        return arr;
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n Elements ");
    int n =sc.nextInt();
    int[] arr = new int[n];
        System.out.println("Enter the elemenets ");
        for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
        System.out.println("input array:  ");
        printArray(arr);
     //   int[] ans = makePrefixSumArray(arr); //WITH
        int[] ans = makePrefixSUMArray(arr);  //WITHOUT NEW ARRAY.
        System.out.println("prefix sum array ");
        printArray(ans);

}
}
