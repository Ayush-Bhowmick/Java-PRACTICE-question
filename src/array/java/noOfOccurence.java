package array.java;
import java.util.Scanner;
public class noOfOccurence {

    static int noOfOccurrence(int[] arr, int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==x){

               count++;
             }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();

         int[] arr = new int[n];
        System.out.println("ENTER " + n + " ELEMENTS: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ENTER X: ");
         int x=sc.nextInt();

        System.out.println("no of X occuremce " + noOfOccurrence(arr, x));
    }
}
