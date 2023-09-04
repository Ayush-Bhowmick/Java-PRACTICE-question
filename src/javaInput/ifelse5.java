package javaInput;
import java.util.Scanner;
public class ifelse5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("SP:-  ");
         int SP=sc.nextInt();
        System.out.println("CP:-  ");
         int CP=sc.nextInt();
         int Profit=SP-CP;
         int loss=CP-SP;
         if(SP>CP){
             System.out.println("the profit is:  "+ Profit);
         }else{
             System.out.println("THE LOSS IS:  "+loss);
         }
    }
}
