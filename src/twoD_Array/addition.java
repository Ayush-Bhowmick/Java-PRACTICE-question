package twoD_Array;

import java.util.Scanner;

public class addition {
    static void printarray( int[][] matrix){
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
    static void sum( int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (r1 != r2 || c1 != c2 ){
            System.out.println("Wrong input - addition not possible");
        return;
        }

        int[][] sum = new  int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }

        }
        printarray(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NO OF R1  ");
        int r1=sc.nextInt();
        System.out.println("Enter the no of c1  ");
        int c1=sc.nextInt();
        int[][] a = new int[r1][c1];   //total r*c
        System.out.println("enter " + r1*c1 + " elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER THE NO OF R2  ");
        int r2=sc.nextInt();
        System.out.println("Enter the no of c2  ");
        int c2=sc.nextInt();
        int[][] b = new int[r2][c2];   //total r*c
        System.out.println("enter " + r2*c2 + " elements");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIX-1 ");
        printarray(a);
        System.out.println();
        System.out.println("Matrix-2 ");
        printarray(b);
        System.out.println();
         sum(a, r1, c1, b, r2, c2);

    }
}
