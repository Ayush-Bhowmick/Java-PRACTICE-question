package Recursion;

public class sumSubset {
    static void subString(int[] a,  int n, int idx, int sum){
        if (idx >= n) {
            System.out.println(sum);
            return;
        }

        //curr idx +sum
        subString(a, n, idx+1, sum+a[idx]);

        //curr ans
        subString(a, n, idx+1, sum);

    }
    public static void main(String[] args) {
         int[] a= {2, 3, 4};
         subString(a,a.length,0,0);
    }
}
//output
//9
//5
//6
//2
//7
//3
//4
//0
