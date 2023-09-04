package javaInput;
import java.util.Scanner;

public class ifelse12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:  ");
        int n=sc.nextInt();
        if ((n%5==0 || n%3==0) && n%15!=0) {
            System.out.println("div by 5 or 3,but not divisible by 15");
        } else {
            System.out.println("not");
        }
    }

}
