package twoD_Array;

import java.util.Scanner;

public class spiralOrder {
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder( int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1  ;

        int totalElement = 0 ;

        while(totalElement < r*c){
            // topRow -> leftColumn to rightColumn
            for (int i = leftCol; i <= rightCol && totalElement < r*c ; i++) {
                System.out.print(matrix[topRow][i] + "  ");
                totalElement++;
            }
            topRow++;
            // rightColumn -> topRow to BottomRow
            for (int j = topRow; j <= bottomRow && totalElement < r*c ; j++) {
                System.out.print(matrix[j][rightCol] + "  ");
                totalElement++;
            }
            rightCol--;
            // bottomRow -> right-column to left-column
            for (int i = rightCol; i >= leftCol && totalElement < r*c; i--) {
                System.out.print(matrix[bottomRow][i] + "  ");
                totalElement++;
            }
            bottomRow--;
            // leftColumn -> bottomRow to topRow
            for (int j = bottomRow; j >= topRow && totalElement < r*c; j--) {
                System.out.print(matrix[j][leftCol] + "  ");
                totalElement++;
            }
            leftCol++;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of rows and column -  ");
         int r=sc.nextInt();
         int c=sc.nextInt();
         int[][] matrix =new int[r][c];
        System.out.println("Enter the "+ r*c  +" elements ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Input matrix");
        printArray(matrix);
        System.out.println();
        System.out.println("The Spiral order ");
        printSpiralOrder(matrix, r, c);
    }
}
//output
//Enter the no of rows and column -
//4 4
//Enter the 16 elements
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
//Input matrix
//1  2  3  4
//5  6  7  8
//9  10  11  12
//13  14  15  16
//
//the Spiral  order
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
//
