
package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int i= 0 ;
        int j =str.length()-1;
        int count=0;
        boolean flag = true;//true->palindrome
        while(i<j){
            if (str.charAt(i) != str.charAt(j)) {
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if (flag=true) {
            System.out.println("its a palindrome");
        }else {
            System.out.println("its a non palindrome");
        }
    }
}
