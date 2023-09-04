//given an array of integer size n .
// Answer q queries where you need to print the sum of values in a given range of indices  from l to r(both included)
//Note-the values of l and r in queries follow 1 based indexing


package array.java;


import java.util.Scanner;


public class prefixSumLtoR {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    static int[]  makePrefixSUMArray(int[] arr){
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
            int[] arr = new int[n+1];                     //je hutu eta 1 indexing tai er size ekta element diye barano.

            System.out.println("Enter the elements ");
            for (int i = 1; i <= n; i++) {                      // 1-INDEXING
                arr[i] = sc.nextInt();
            }
            System.out.println("input array:  ");
            printArray(arr);
            //   int[] ans = makePrefixSumArray(arr);           //WITH
            int[] ans = makePrefixSUMArray(arr);                //WITHOUT NEW ARRAY.

           System.out.println("ENTER THE NO OF QUERIES  ");
           int q=sc.nextInt();

           while (q-- > 0)
           {
             System.out.println("ENTER RANGE  ");
              int l=sc.nextInt();
              int r=sc.nextInt();
              int ANS = ans[r] - ans[l-1];                        // arr[3] - arr[2-1]
               System.out.println("sum "+ ANS);
           }

    }

}

//output
//Enter the n Elements
//5
//Enter the elements
//1 2 3 4 5
//input array:
//0  1  2  3  4  5
//ENTER THE NO OF QUERIES
//5
//ENTER RANGE
//2 3
//sum 5
//ENTER RANGE
//3 4
//sum 7
//ENTER RANGE
//5 5
//sum 5
//ENTER RANGE
//2 5
//sum 14
//ENTER RANGE
//6 4
//sum -5