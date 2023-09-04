package javaInput;
import java.util.Scanner;
public class ifelse9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:  ");
         int n=sc.nextInt();
         if(n%15==0){
             System.out.println("The number is divisible by both 3 and 5");
         }else {
             System.out.println("The number is not divisible by 3 and 5");
         }

    }
}
