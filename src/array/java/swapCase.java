package array.java;

import java.util.Scanner;

public class swapCase {
    static int swapNumber(int a , int b){
        System.out.println("Enter the number ");
        System.out.println("a "+ a);
        System.out.println("b " + b);

        int c = 0 ;
        c=a;
        a=b;
        b=c;

        System.out.println("After swap values ");
        System.out.println("a "+ a);
        System.out.println("b " + b);

        return c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the no of elements- ");
//         int n=sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements-  ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        int a = 9;
        int b = 6;
        //int[] arr = {1.2.3.4.5};
        swapNumber(a,b);
    }
}
