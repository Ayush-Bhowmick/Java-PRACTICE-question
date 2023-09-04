package javaInput;
import java.util.Scanner;


public class ifelse11 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("AGE a:   ");
    int a=sc.nextInt();
    System.out.println("AGE b:   ");
    int b=sc.nextInt();
    System.out.println("AGE OF c:   ");
    int c=sc.nextInt();
    if(a<b && a<c){
        System.out.println("a is the YOUNGEST ");
    }else if(b<a && b<c){
        System.out.println("b is the YOUNGEST ");
    }else {
        System.out.println("c is the YOUNGEST");
    }
}
}
