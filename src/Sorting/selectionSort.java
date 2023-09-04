package Sorting;

public class selectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index= i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_index]){
                    min_index=j;
                }
            }
            //swap
            int temp= arr[i];
            arr [i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
//output
//1 2 3 4 5 6 7 8 9
