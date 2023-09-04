package javaInput;
import java.util.Scanner;
public class ifelse8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         if(n>100 && n<1000){
             System.out.println("Its a 3 digit number");
         }else{
             System.out.println("not a 3 digit number");
         }

    }
}
