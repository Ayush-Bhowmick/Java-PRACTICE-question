package Recursion;

public class SumOfArray {
    static int sumArray(int[] arr, int idx){
        int n = arr.length;
        if (idx == n-1){
            return arr[idx];
        }
        return arr[idx] + sumArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr= {2, 3, 5, 20, 1};
        System.out.println( sumArray(arr, 0));
    }
}
//31