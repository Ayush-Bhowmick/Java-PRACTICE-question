package javaInput;
import java.util.Scanner;
public class ifelse7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER PERCENTAGE: ");
         int n =sc.nextInt();
        if (n >90) {
            System.out.println("excellemt");
        } else if (n>80){
            System.out.println("very good");
        } else if (n>70){
            System.out.println("good");
        } else if (n>60){
            System.out.println("well-done");
        } else if (n>40){
            System.out.println("can to better");
        } else if (n>30){
            System.out.println("work hard");
        }
    }
}
