package javaInput;
import java.util.Scanner;
public class ifelse3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your YEAR:-  ");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("It's a LEAP Year");
        }else{
            System.out.println("It's an Ordinary Year");
        }
    }
}
