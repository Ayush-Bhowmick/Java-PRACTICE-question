package javaInput;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("odd number");
        }
    }

}
