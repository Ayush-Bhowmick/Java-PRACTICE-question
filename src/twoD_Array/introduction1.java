package twoD_Array;

import java.util.Scanner;

public class introduction1 {

    static void printarray( int[][] arr2){
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NO OF R  ");
         int r=sc.nextInt();
        System.out.println("Enter the no of c  ");
          int c=sc.nextInt();
        int[][] arr = new int[r][c];   //total r*c
        System.out.println("enter " + r*c + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //int[][] arr2 = {{1,2,3}, {3,4,5}, {7,8,9}};
        printarray(arr);
    }
}
