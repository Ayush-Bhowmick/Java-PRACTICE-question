//worst time case brute force
//given matrix "a" of dimension n * m and 2 coordinate(l1,r1) and (l2,r2) return the sum of rectangle
package twoD_Array;

import java.util.Scanner;

public class sumOfRectangle {
    static int findSum1(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;

        for (int p = l1; p <= l2; p++) {
            for (int i = r1; i <= r2 ; i++) {
                sum += matrix[p][i];
            }
        }
        return sum;
    }

    static void findPrefixSumMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {   //matrix[0].length  -> row at index zero
                matrix[i][j]  +=  matrix[i][j-1];   //prefix sum row wise
            }
        }
    } // row_Wise
    static void findPrefixSumMatrix_COL_Wise(int[][] matrix){
        for (int j = 0; j < matrix[0].length; j++) {  //fixing col
            for (int i = 1; i < matrix.length; i++) {   //matrix[0].length  -> row at index zero
                matrix[i][j]  +=  matrix[i-1][j];   //prefix sum col wise
            }
        }
    } //col wise

    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
          int sum = 0 ;
          findPrefixSumMatrix(matrix);
        for (int p = l1; p <= l2; p++) {
            //r1 to r2 ka sum for row 1
            if (r1 >= 1){
                sum += matrix[p][r2] - matrix[p][r1 - 1];
        }
            else {
                sum += matrix[p][r2];
            }
        }
          return sum;
    }


    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
          int ans=0, sum = 0, up = 0, left = 0, leftup =0;
        findPrefixSumMatrix_COL_Wise(matrix);

        sum = matrix[l2][r2];

        if (r1 >= 1 )
        left = matrix[l2][r1 - 1];

        if (l1 >= 1 )
        up = matrix[l1 -1][r2];

        if ( l1 >= 1   && r1 >= 1 )
        leftup = matrix[l1 -1][r1 -1];

                ans = sum - up - left + leftup;




          return ans;
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

        System.out.println(" Enter the rectangle boundaries ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println(" sum of boundaries 1  ->   " + findSum1(matrix,l1,r1,l2,r2));
        System.out.println(" sum of boundaries 2  ->   " + findSum2(matrix,l1,r1,l2,r2));
        System.out.println(" sum of boundaries 3  ->   " + findSum3(matrix,l1,r1,l2,r2));




    }
}
