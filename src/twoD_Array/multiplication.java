package twoD_Array;

import java.util.Scanner;

public class multiplication {
    static void printable(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply( int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if ( c1 != r2) {
            System.out.println("Wrong input - multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) { //row number
            for (int j = 0; j < c2; j++) { //col number
                for (int k = 0; k < c1; k++) {  // addition traversal koto bar add korbi tai eta c1/r2
                   //ith row of a * jth col of b
                    mul[i][j] += a[i][k] * b[k][j];
                }

            }
        }
        System.out.println("multiplication of 2 matrices ");
        printable(mul);
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
        printable(a);
        System.out.println("Matrix-2 ");
        printable(b);
            multiply(a, r1, c1, b, r2, c2);

}
}
//ENTER THE NO OF R1
//2
//Enter the no of c1
//3
//enter 6 elements
//1 2 1
//2 1 2
//ENTER THE NO OF R2
//3
//Enter the no of c2
//2
//enter 6 elements
//1 2
//2 1
//1 1
//MATRIX-1
//1 2 1
//2 1 2
//Matrix-2
//1 2
//2 1
//1 1
//multiplication of 2 matrices
//6 5
//6 7