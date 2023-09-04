package Recursion;

public class maxValueArray {

    static int Max(int[] arr, int idx){

        int n = arr.length;
        if( idx == n-1) return arr[idx];

        // Small problem -> idx+1, end of array -> max-> return
        int smallWork = Max(arr, idx+1);

        // selfWork and final ANS
        return Math.max(arr[idx], smallWork);

    }

    public static void main(String[] args) {
         int[] arr = { 2, 5, 7, 12};

        System.out.println(Max(arr, 0));
    }
}
