package Recursion;

import java.util.Scanner;

public class KmultiplesOFnumberN {

    static void Kmul(int n, int k){  // 5 4
        //base case
//        if(k == 1 ){
//            System.out.println(n);
//            return ;
            if(k == 0 ){
            return ;

        }

        // recursive work
        Kmul(n, k-1);  // 5 10 15

        //self work
        System.out.println( n *  k); //20
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number- ");
         int number =sc.nextInt();
        System.out.println("Enter the k ( Upto which u want to see multiples of the number)-   ");
         int k =sc.nextInt();
        Kmul(number,k);
    }
}
