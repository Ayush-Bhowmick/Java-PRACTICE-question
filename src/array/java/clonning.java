package array.java;
import java.util.Arrays;
import java.util.Scanner;

public class clonning {

    static void printable(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the no of elemnts:  " );

         int n = sc.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
    //original array
        System.out.println("original array");
        printable(arr);
        //copying original array
        int[] arr_2= arr.clone();
        System.out.println("copied array");
        printable(arr_2);
        //changing values
        arr_2[0]=0;
        arr_2[1]=0;
        printable(arr_2);

    }
}
