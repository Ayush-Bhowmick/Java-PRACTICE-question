package array.java;
import java.util.Scanner;
public class print_same {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of  element : ");
            int n =sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER THE ELEMENTS:  ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
