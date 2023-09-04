package Recursion;

import java.util.Scanner;

public class alternateSigns{
    static int altSum(int n){   //1 - 2 + 3 - 4 + 5 - 6 + 7
        if (n == 0){
            return 0;
        }
        if ( n % 2 == 0) {
            return altSum(n-1) -n ;
        } else {
            return altSum(n-1) +n ;

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
        System.out.println(altSum(n));
    }
}
//10
//-5