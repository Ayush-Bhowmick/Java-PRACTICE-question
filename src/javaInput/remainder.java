package javaInput;
import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend :- ");
        int a= sc.nextInt();
        System.out.println("ENTER the divisor :- ");
        int b= sc.nextInt();
        int q=a/b;
        System.out.println("the quotient is: "+q+" on dividing "+a+" with "+b);
        int r= a-(b*q);
        System.out.println("the remainder is: "+r+" on dividing "+a+" with "+b);
    }
}
