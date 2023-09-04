package array.java;
import java.util.Scanner;
public class secondLargest {

    static int Largest(int[] arr){
        int mx= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int secondLargest(int[] arr){
        int mx= Largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== mx){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int secondMAX = Largest(arr);
        return secondMAX;
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
        System.out.println(" SECOND LARGEST NUMBER" +secondLargest(arr));
    }
}
