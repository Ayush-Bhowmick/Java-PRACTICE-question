package LOOP;
import java.util.Scanner;
public class hollowTri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int r =sc.nextInt();
          int c=sc.nextInt();
        for (int i = 1; i <= r ; i++) {

            for (int k = 1; k <=r-i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= c ; j++) {

               if( (i+j == r || r==i )){
                   System.out.print(i);
               }
            }
            for (int l = i-1; l >=1 ; l--) {
                if ( l == 2*i-1 ) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
