package array.java;

import java.util.Scanner;

public class reverseAnArray {
    static int[] reverseArray(int[] arr){
        int n= arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-1; i >= 0 ; i-- ) {
            ans[j++] = arr[i]; //reverse  ans[j]=arr[j] j++
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements- ");
         int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements-  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = reverseArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "  ");
        }
//        System.out.println("Reverse array :  " + reverseArray(arr) );
    }
}
