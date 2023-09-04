package array.java;

import java.util.Scanner;

public class sortEvenOdd {
    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int left, int right){
        int temp =arr[left];
        arr[left] = arr[right] ;
        arr[right] = temp;
    }
    static void sortEvenOdd(int[] arr, int left, int right){
        int n = arr.length;
//        int left =0 , right =n-1;
        while(left < right){
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0 ) {
                swap(arr,left,right);
                left++;
                right--;
            }
           if (arr[left]% 2 ==0) {

               left++;
            } if (arr[right]% 2 !=0) {

               right--;
            }
        }
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
        sortEvenOdd( arr,  0,  n-1);
        System.out.print(" Array after sorting  ");
        printArray(arr);
    }
}
