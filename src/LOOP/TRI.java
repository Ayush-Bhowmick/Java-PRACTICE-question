package LOOP;
import java.util.Scanner;
public class TRI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER R: ");
         int r=sc.nextInt();
        for (int i = 1; i <= r ; i++) {
            //space
            for (int j = 1; j <=r-i; j++) {
                System.out.print(" ");
            }
            //starts
            for (int k = 1; k <= (2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
