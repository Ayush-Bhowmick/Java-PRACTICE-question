package Recursion;

import java.util.Scanner;

public class powerBetterApproach {
    static int pow(int p, int q ){
        //base case
        if ( q == 0){
            return 1;
        }
        // recursive work
        int smallWork = pow(p,q/2);

        // self Work
        if ( q % 2 == 0) {
            return smallWork * smallWork;
        }else {
            return smallWork * smallWork * p;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter THE NUMBER- ");
        int p =sc.nextInt();
        System.out.println("Enter THE POWER - ");
        int q=sc.nextInt();
        System.out.println(pow(p,q));
    }
}
//Enter THE NUMBER-
//6
//Enter THE POWER -
//3
//216