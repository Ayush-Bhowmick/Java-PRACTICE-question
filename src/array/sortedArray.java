package array;
import java.util.Arrays;
import java.util.Scanner;
public class sortedArray {
    static int[] smallerAndLargest(int[] arr){
        Arrays.sort(arr);

            int[] ans = { arr[0], arr[arr.length-1]};
            return ans;


    }
    static void smallerAndLarger(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    static boolean inSorted(int[] arr){
        boolean check=false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("ENTER the no of elements: ");
        int n=sc.nextInt();
        int[] arr = new  int[n];
        System.out.println("enter the elements: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i]= sc.nextInt();
        }
       // inSorted(arr);
        System.out.println("IS THE ARRAY IS SORTED : " + inSorted(arr));
        System.out.println("So here is the sorted array: " );
        smallerAndLarger(arr);
        System.out.println();
        int[] ans=  smallerAndLargest(arr);
        System.out.println("SMALLEST : " + ans[0]);
        System.out.println("LARGEST : " + ans[1]);
    }
}
