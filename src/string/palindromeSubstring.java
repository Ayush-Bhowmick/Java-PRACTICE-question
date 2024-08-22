//given a substring S,  return the number of palindrome substring in it

package string;

import java.util.Scanner;

public class palindromeSubstring {
    public static boolean isplaindrome(String str){
        int i= 0 ;
        int j =str.length()-1;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string ");
        String str= sc.nextLine();
         int count =0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                if ( isplaindrome(str.substring(i,j)) ==true) {
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nthe no of palindrome are "+count);
    }
}
//Enter your string
//abcbadefedghihg
//a abcba b bcb c b a d defed e efe f e d g ghihg h hih i h g
//the no of palindrome are 21
