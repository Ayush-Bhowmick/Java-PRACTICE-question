package Sorting;

public class insertion {
    static void insertionSort(int[] a){
       int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;

            while( j > 0 && a[j] < a[j-1]){
                int temp= a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(a);
        for (int val : a ) {
            System.out.print(val +" ");
        }
    }
}
//output
// 1 2 3 4 5 6 7 8 9
