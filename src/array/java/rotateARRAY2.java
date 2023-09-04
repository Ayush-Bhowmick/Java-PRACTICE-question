package array.java;

import java.util.Scanner;

public class rotateARRAY2 {
    static void indexSwapping(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
    static void reverse(int[] arr, int i, int j ){
        while(i < j){
            indexSwapping( arr,i,j);
            i++;
            j--;
        }

    }
    static void reverseBYindex(int[] arr , int k){

        int n= arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0 , n-1);
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
        System.out.println("Enter k");
        int k= sc.nextInt();

        System.out.println("ORIGINAL Array ");
        printarray(arr);
        reverseBYindex(arr,k);
        System.out.println("rotated "+ n +" times Array ");
        printarray(arr);
    }
}
