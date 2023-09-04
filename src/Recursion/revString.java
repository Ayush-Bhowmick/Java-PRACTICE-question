//write a prog to print reverse of a string using recursion

package Recursion;
import java.util.Scanner;
public class revString {

    static String reverse(String s, int idx){
        if (idx == s.length()) return "";
        String smallAns= reverse(s, idx+1);
        return smallAns+ s.charAt(idx);
    }
//without idx
static String reverse1(String s){
    if ( s.length() == 0) return "";
    String smallAns= reverse1(s.substring(1));
    return smallAns+ s.charAt(0);
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s, 0));
        System.out.println(reverse1(s));
    }

}
//ayush bhowmick
//kcimwohb hsuya
//kcimwohb hsuya
