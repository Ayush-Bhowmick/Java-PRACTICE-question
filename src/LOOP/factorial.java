package LOOP;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:  ");
         int n=sc.nextInt();
         int ans=1;
        for (int i = 1; i <= n; i++) {
            ans=ans*i;
            System.out.println("The factorial of "+ n + " is " + ans );
        }

    }
}
