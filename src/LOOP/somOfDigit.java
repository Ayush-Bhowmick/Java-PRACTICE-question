package LOOP;
import java.util.Scanner;
public class somOfDigit {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER the number:  ");
        int n=sc.nextInt();
        int SumCount=0;
        int originalN=n;

        while (n>0){

            SumCount += n%10;
            n /= 10;

        }

        System.out.println("the number of digit present in " + originalN+ "  is  " + SumCount);

    }

}

