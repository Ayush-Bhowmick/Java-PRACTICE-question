//Given an integer ,return the n rows of Pascal"s Triangle.                              1
// In pascal each number is the sum of the 2 number directly above it                   1 1
//                                                                                     1 2 1
//                                                                                    1 3 3 1
//   JAGED ARRAY                                                                      1 4 6 4 1

package twoD_Array;

import java.util.Scanner;

public class pascalTriangle {
    static  void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            //ith row has i+1 col.
            //ans[0] = new int[1]
            //ans[1] = new int[2]
                     ans[i] = new int[i+1];
            //1st and last element of row is 1.
                ans[i][0] = ans[i][i] = 1 ;
                //
            for (int j = 1; j < i; j++) { // j=1 karon oth element toh fill korei diyechii ar ith element oo
                ans[i][j] = ans[i-1][j]+ ans[i-1][j-1];
            }
        }
        return ans ;
    }
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of rows ");
     int n=sc.nextInt();
     int [][] ans = pascal(n);
printMatrix(ans);

    }
}
