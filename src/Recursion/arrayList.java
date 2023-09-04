package Recursion;

import java.util.ArrayList;


public class arrayList {

//    arraylist = {4, 4, 7, 4}
//    target= 4
//    ans = {0, 1, 3};

    static ArrayList<Integer> allIndex(int[] arr, int target, int idx){
        //BASE CASE empty array
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        if (idx >= n) {
            return new ArrayList<>(); // empty arraylist or return and which is equal to new ArrayList<>()

        }


        //selfWork   check if current element arr[idx] is equal to target print all the index .
        if (arr[idx] == target) {
            ans.add(idx);    // idx ->  0   adding the index to the list
        }


        //SMALLER PROBLEM IS TARGeT present in the array arr starting from idx+1  .
        ArrayList<Integer> smallAns = allIndex(arr, target, idx + 1);  // 1 3
        ans.addAll(smallAns);  // 0 1 3

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {14, 14, 54, 14, 3, 8, 6, 14};
        int target = 14;
        ArrayList<Integer> ans = allIndex(arr, target, 0);
        for(Integer i : ans){
            System.out.println(i);
        }
    }
}
