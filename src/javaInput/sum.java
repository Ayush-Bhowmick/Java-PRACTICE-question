package javaInput;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:- ");
         int x= sc.nextInt();
         int y =sc.nextInt();
         double sum = x+y;
        System.out.println(sum);

    }
}
