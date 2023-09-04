package array;
import java.util.Scanner;
public class lastOcurence {
    static int lastOccurrence(int[] arr , int x){
        int last_index=-1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]== x){
                last_index= i;
            }
        }
        return last_index;
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
        System.out.println("no of X LastOccuremce " + lastOccurrence(arr, x));

    }
}
