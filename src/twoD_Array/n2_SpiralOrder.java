package twoD_Array;

import java.util.Scanner;

public class n2_SpiralOrder {
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralOrder( int n ){
        int[][] matrix = new int[n][n];


        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1  ;

        int current = 1 ;

        while(current <= n*n){
            // topRow -> leftColumn to rightColumn
            for (int i = leftCol; i <= rightCol && current <= n*n ; i++) {

                matrix[topRow][i]  = current++;
            }
            topRow++;
            // rightColumn -> topRow to BottomRow
            for (int j = topRow; j <= bottomRow && current <= n*n ; j++) {

                matrix[j][rightCol] = current++;
            }
            rightCol--;
            // bottomRow -> right-column to left-column
            for (int i = rightCol; i >= leftCol && current <= n*n; i--) {

                matrix[bottomRow][i] =  current++;
            }
            bottomRow--;
            // leftColumn -> bottomRow to topRow
            for (int j = bottomRow; j >= topRow && current <= n*n; j--) {

                matrix[j][leftCol] =  current++;
            }
            leftCol++;
        }
return matrix;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n -  ");
        int n=sc.nextInt();
        int[][] matrix = generateSpiralOrder(n);
        printArray(matrix);
    }
}
//Enter the n -
//9
//1  2  3  4  5  6  7  8  9
//32  33  34  35  36  37  38  39  10
//31  56  57  58  59  60  61  40  11
//30  55  72  73  74  75  62  41  12
//29  54  71  80  81  76  63  42  13
//28  53  70  79  78  77  64  43  14
//27  52  69  68  67  66  65  44  15
//26  51  50  49  48  47  46  45  16
//25  24  23  22  21  20  19  18  17  