// ROTATE THE GIVEN ARRAY BY "K"TH POSITION  EG- 1 2 3 4 5 ROTATE by 1 mean 5 1 2 3 4 ; by 2 means 4 5 1 2 3

package array.java;
import java.util.Scanner;

public class rotateTheArrayBy_K_pos {
     static void printarray(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");

         }
     }
    static int[] rotate(int[] arr , int k){
        int n = arr.length;
         k= k % n;  //no of rotation
         int[] ans = new int[n];
         int j = 0;

        for (int i = n-k; i < n; i++) { //second half of array 4 5

            ans[j++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) { //first half half of array 1 2 3

            ans[j++]=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
         int n=sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter the  elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER K ");
         int k =sc.nextInt();

        System.out.println("Original array: ");
        printarray(arr);
        System.out.println();
        int[] ans = rotate(arr , k);
        System.out.println("Array after Rotation : ");
        printarray(ans);
    }



}
//output
//5
//Enter the  elements
//1 2 3 4 6
//ENTER K
//4
//Original array:
//1 2 3 4 6
//Array after Rotation :
//2 3 4 6 1
//Process finished with exit code 0
