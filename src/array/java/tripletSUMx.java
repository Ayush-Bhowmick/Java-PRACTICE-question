package array.java;
import java.util.Scanner;
public class tripletSUMx {

    static int sumTotalX(int[] arr , int target){
        int n= arr.length;
        int ans  =0;
        for (int i = 0; i < n; i++) { //first number
            for (int j = i+1; j < n; j++) { //second number
                for (int k = j+1; k < n; k++) { // third number
                    if (arr[i]+arr[j]+arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF ELEMENTS: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("enter the target ");
        int target =sc.nextInt();
        System.out.println( "  No of triplets are: "+sumTotalX(arr , target));
    }
}
