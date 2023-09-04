package twoD_Array;

import java.util.Scanner;

public class transposeMatrix2 {
    static void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    static void printable(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposedMatrix(int[][] matrix, int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {  // j=i tao hbe
                swap(matrix, i, j);break;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and column ");
         int r=sc.nextInt();
         int c=sc.nextInt();
         int[][] matrix = new int[r][c];

        System.out.println("Enter the elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("INPUT MATRIX ");
        printable(matrix);
        System.out.println("TRANSPOSE MATRIX ");
        transposedMatrix( matrix, r, c);
        printable(matrix);
    }
}
