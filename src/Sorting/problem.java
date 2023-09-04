//given an integer array arr, move all the 0's to the end of it while maintaining the relative order
//of the non-zero element.(use in place without making copy)

package Sorting;

public class problem {
    static void costamiseInsertion(int[] a){
        int n=a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (a[j]==0 && a[j+1] != 0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={0, 5, 0, 9, 7, 3};
        costamiseInsertion(a);
        for (int s: a) {
            System.out.print(s+" ");
        }
    }
}
//output
// 5 9 7 3 0 0
