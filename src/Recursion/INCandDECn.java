package Recursion;

import java.util.Scanner;

public class INCandDECn {
    static void printInc(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        printInc(n-1);  //1 2 3 4
        System.out.println(n);  //5
    }
    static void printDec(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);  //5
        printDec(n-1);  //1 2 3 4

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n-  ");
         int n =sc.nextInt();
         printInc(n);  // 1 2 3 4 5
        System.out.println();
        printDec(n) ;  // 5 4 3 2 1
    }
}
