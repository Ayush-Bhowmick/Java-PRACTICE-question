package LOOP;
import java.util.Scanner;
public class somOfSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE LAST NUMBER OF SERIES WHERE EVEN NUMBERS ARE SUBTRACTED :  ");
         int n=sc.nextInt();
         int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i %2 == 0) {
                ans -=i;
            }else {
                ans+=i;
            }
        }
        System.out.println("the sum os series is:  "+ ans );
    }
}
