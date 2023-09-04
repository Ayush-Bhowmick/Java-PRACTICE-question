package Recursion;

import java.util.Scanner;

public class power {

    static int pow(int p, int q){
        //base case
        if (q == 0 ){
            return 1;
        }

        // recursion + selfWork
        return pow(p,q-1) * p;
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
//Enter P-
//5
//Enter Q-
//3
//125