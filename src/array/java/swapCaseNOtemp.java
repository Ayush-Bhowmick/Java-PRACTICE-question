package array.java;

import java.util.Scanner;

public class swapCaseNOtemp {
    static int swapCase(int a,int b){
       a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping values");
        System.out.println("A " + a);
        System.out.println("B " + b);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number A ");
         int a=sc.nextInt();
        System.out.println("Enter the number B ");
          int b=sc.nextInt();
          swapCase(a,b);
    }
}
