package array.java;
import java.util.Scanner;
public class uniqueElement {
    static int findUniqueNo(int[] arr){
        int n =  arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans = -1 ;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=-1){
                ans=arr[i];
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


        System.out.println( "  unique : "+findUniqueNo(arr ));
    }
}
