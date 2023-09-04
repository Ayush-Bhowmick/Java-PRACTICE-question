package Recursion;

public class search {

    //return all the indexes of the number if it is present

    static void allindex(int[] arr, int target, int idx){
        //BASE CASE empty array
        int n = arr.length;
        if (idx >= n) {
            return ;
        }


        //selfWork   check if current element arr[idx] is equal to target print all the index .
        if (arr[idx] == target) {
            System.out.println(idx);
        }


        //SMALLER PROBLEM IS TARGeT present in the array arr starting from idx+1  .
        allindex(arr, target, idx + 1);
    }








//return first index if target is present
    static int firstindex(int[] arr, int target, int idx){
        //BASE CASE empty array
        int n = arr.length;
        if (idx >= n) {
            return -1;
        }


        //selfWork   check if current element arr[idx] is equal to target.
        if (arr[idx] == target) {
            return idx;
        }


        //SMALLER PROBLEM IS TARGeT present in the array arr starting from idx+1.
        return firstindex(arr, target, idx + 1);
    }









    //true false -> based on existence
    static boolean Search(int[] arr, int target, int idx) {
        //BASE CASE empty array
        int n = arr.length;
        if (idx >= n) {
            return false;
        }

        //selfWork   check if current element arr[idx] is equal to target.
        if (arr[idx] == target) {
            return true;
        }

        //SMALLER PROBLEM IS TARGeT present in the array arr starting from idx+1.

        return Search(arr, target, idx + 1);

//       if (linearSearch( arr, target, idx+1)){
//            return true;
//       } else {
//           return false;
//       }
    }

    public static void main(String[] args) {
      //  int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};
        int[] arr = {14, 14, 54, 14, 3, 8, 6, 14};
        int target = 14;

        allindex(arr, target, 0);

 //       System.out.println(firstindex(arr, target, 0));


//        if (Search(arr, target, 0)) {
//            System.out.println(" YES ");
//        } else {
//            System.out.println(" NO ");
//        }
    }
}
//  allindex
//0
//1
//3
//7


//search
// YES


//  index
//3