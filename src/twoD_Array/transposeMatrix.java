package twoD_Array;

import java.util.Scanner;

public class transposeMatrix {
    static void printable(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix, int r,int c){
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows number and columns number ");
         int r=sc.nextInt();
         int c=sc.nextInt();
        int[][] matrix = new  int[r][c];
        System.out.println("ENTER "+ r*c +" elements   ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("INPUT MATRIX ");
        printable(matrix);
        System.out.println("TRANSPOSE MATRIX ");
       // printable(transpose());

        int[][] transposedArray = transpose(matrix, r, c);
        printable(transposedArray);

    }
}
//Enter the rows number and columns number
//3 3
//ENTER 9 elements
//1 2 3
//4 5 6
//7 8 9
//INPUT MATRIX
//1 2 3
//4 5 6
//7 8 9
//TRANSPOSE MATRIX
//1 4 7
//2 5 8
//3 6 9
