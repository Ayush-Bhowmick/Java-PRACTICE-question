package twoD_Array;

import java.util.Scanner;

public class rotate90degMatrix {

    static void printable(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static void transposedMatrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {  // j=i tao hbe
                swap(matrix, i, j);
            }
        }
    }


    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;;
            i++;
            j--;
        }
    }

        static void rotate ( int[][] matrix, int n ){
            //transpose
            transposedMatrix(matrix, n, n); //sq matrix jekhane r=n ar c=n tai n,n
            //reverse each row of transpose matrix

            for (int i = 0; i < n; i++) {
                reverseArray(matrix[i]);
            }
        }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows and column ");
            int r = sc.nextInt();  //these will always be equal
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];

            System.out.println("Enter the elements");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("INPUT MATRIX ");
            printable(matrix);
            rotate(matrix, r);  // same bole r
            System.out.println("ROTATE MATRIX ");
            printable(matrix);
        }

    }

//output
//Enter the number of rows and column
//3 3
//Enter the elements
//2 3 4
//5 6 7
//8 9 1
//INPUT MATRIX
//2 3 4
//5 6 7
//8 9 1
//ROTATE MATRIX
//8 5 2
//7 6 3
//1 9 4
