//Given an integer array "a" sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
package array.java;

import java.util.Scanner;

public class sortSQUAREarray {
    static void indexSwapping(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            indexSwapping( arr,i,j);
            i++;
            j--;
        }

    }
    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int left =0 , right=n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left <= right){
            //bigger number square is added to ans
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Elements-  ");
        int n =sc.nextInt();
        int[] arr = new  int[n];
        System.out.println("enter the no of elemenets  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Original array ");
        printArray(arr);
       int[] ans= sortSquare(arr);
        System.out.print(" Array after sorting  ");
        reverse(ans, 0, n-1);
        printArray(ans);
    }
}
//output
//Enter the no of Elements-
//5
//enter the no of elemenets
//-7 -3 5 7 9
//Original array -7 -3 5 7 9
// Array after sorting  9 25 49 49 81
