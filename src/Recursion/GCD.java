package Recursion;

import java.util.Scanner;



public class GCD {
    static int gcd2(int x, int y) {

        //                                                 EUCLID LAW

        if( y == 0){
            return x;
        }

        // y !=0 then
        return gcd2(y, x % y);

    }
    static int gcd1(int x, int y) {
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the two number of which gcd is req ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcd1(x,y));
        System.out.println(gcd2(x,y));
    }
}
//output 1,2 (gcd1 , gcd2)
// enter the two number of which gcd is req
//32 64
//32