//The string should be compressed such that consecutive duplicates of character are replaced with the char
// and the number of occurence of  the followed duplicate character

package string;

public class compressedString {
    public static void main(String[] args) {
        String str ="aaabbbbccddddeeefggg";
        String ans = " " + str.charAt(0);
         int count=1;
         for (int i = 1; i <str.length() ; i++) {
            char prev = str.charAt(i-1);
            char curr = str.charAt(i);
            if (curr == prev) {
                count++;
            }else {
               if (count>1) ans+=count;
                count=1;
                ans+=curr;
            }
        }
        if (count>1) ans+=count;
        System.out.println(ans);

    }
}
//output
 //a3b4c2d4e3f1g
// a3b4c2d4e3fg3
