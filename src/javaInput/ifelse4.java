package javaInput;
import java.util.Scanner;
public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            num= num*(-1);
            System.out.println("ABSOLUTE VALUE:- "+num );
        }else {
            System.out.println("absolute number");
        }
    }
}
