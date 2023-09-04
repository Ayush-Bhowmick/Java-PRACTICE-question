package javaInput;
import java.util.Scanner;
public class ifelse10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("a:   ");
         int a=sc.nextInt();
        System.out.println("b:   ");
          int b=sc.nextInt();
        System.out.println("c:   ");
           int c=sc.nextInt();
           if(a>b && a>c){
               System.out.println("a is the greatest number ");
           }else if(b>a && b>c){
               System.out.println("b is the greatest number ");
           }else {
               System.out.println("c is the greatest number");
           }
    }
}
