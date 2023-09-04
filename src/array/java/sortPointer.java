//SORT AN ARRAY CONSISTING OF ONLY 0s AND 1s
package array.java;

import java.util.Scanner;

public class sortPointer {

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + "  ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
static void sortzeroandone(int[] arr, int left, int right){
        while (left< right){
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
}
    static void sortZeroAndOne(int[] arr){
        int n = arr.length;

        //count Zeros
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                zeroes++;
            }
        }
        // put 0 from index 0 to Zeros-1 and rest 1

        for (int i = 0; i < n; i++) {
            if (i < zeroes){ // i er value 0 theke choto

                arr[i] = 0;
            }else {

                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NO OF ELEMENTS: ");
         int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array- ");
        printArray(arr);
        sortzeroandone(arr,0,n-1);
        System.out.println("After Sorting-  ");
        printArray(arr);
    }
        }
        //output
//ENTER THE NO OF ELEMENTS:
//10
//Enter the elements:
// 1 0 1 0 1 1 0 0 0 1
//Original array-
//1  0  1  0  1  1  0  0  0  1
//After Sorting-
//0  0  0  0  0  1  1  1  1  1