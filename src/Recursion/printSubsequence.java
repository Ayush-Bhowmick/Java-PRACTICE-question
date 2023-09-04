package Recursion;

public class printSubsequence {
    static  void  ssq(String s, String currAns){

        //base case
        if (s.length()==0){
            System.out.println(currAns);//last a toh empty string ee bchbe tai okhane back kore jbo
            return;
        }
        //recursion
        char curr= s.charAt(0);//a
        String smallAns= s.substring(1);//bc
        //curr -> choose to be a part of string
        ssq(smallAns, currAns+curr);//bc,a
        //curr -> char choose not to be a part of the string
        ssq(smallAns,currAns);//bc," "


    }
    public static void main(String[] args) {
        ssq("abc"," ");
    }
}
//output

// abc
// ab
// ac
// a
// bc
// b
// c
//
