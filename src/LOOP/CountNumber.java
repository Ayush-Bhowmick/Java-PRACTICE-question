package LOOP;
import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:  ");
        int n=sc.nextInt();
        int numberCount=0;
        int originalN=n;

        while (n>0){
            n /= 10;
            numberCount++;
        }
        System.out.println("the number of digit present in " + originalN+ "  is  " + numberCount);
    }
}
