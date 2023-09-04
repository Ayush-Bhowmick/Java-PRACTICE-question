//Check if we can partition the array into two sub-array with equal sum.
//More formally check the prefix sum of the first part of the array EQUAL to the suffix part of the array

package array.java;

import java.util.Scanner;

public class partitionArrayEqualSum {

    static int findArraySum(int[] arr){
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
           totalSum += arr[i] ;
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
 //total sum
        int totalSum = findArraySum(arr);
        // prefSUM
        int prefsum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            prefsum += arr[i];
            //suffixSum
            int suffixSum = totalSum - prefsum;
            //if p=s

            if(suffixSum== prefsum){
                // true
                return true;
            }

        }
       return false;  //puro traversal korar por jkhn asbe na tokhn false.krn
        // return puro program er execution bondho kore debe tai sobr sesh a hbe etaa


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of the elements- ");
         int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("EQUAL PARTITION POSSIBLE-  " +  equalSumPartition(arr));
    }
}
//OUTPUT
//Enter the no of the elements-
//5
//Enter the elements
//10 8 7 6 5
//EQUAL PARTITION POSSIBLE-  true
