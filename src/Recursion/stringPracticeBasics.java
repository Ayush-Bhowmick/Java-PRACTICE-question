//Remove all the occurrences of "a" from string abcax

package Recursion;

import java.util.Scanner;
import java.lang.String;

public class stringPracticeBasics {
 static String removeA2(String s){
     if (s.length() == 0 ) {               // 0 theke start kore last obdi jaye then return a check hoyee
         return " ";
     }
     String smallAns = removeA2( s.substring(1));
     char currChar = s.charAt(0);
//
     //selfwork
     if (currChar == 'a' ) return smallAns;   //' ' - eta char aa use hoye ar r ekhane
         // " " eta use hoye na krn ota char ta k string a convert kore deye eta char ee thkte deye
     else {
         return currChar + smallAns;  //concatination od string is not an const time opteration  tc-> o(lenthg of string)
     }
 }

   static String removeA(String s, int idx){
      //Base case
      if (idx == s.length()) {
           return " ";   // jkhn amra recursion aa jachi  tokhn empty string return kore
      }
      //recursive work
      String smallAns = removeA( s, idx+1);
      char currChar = s.charAt(idx);
//
      //selfwork
      if (currChar == 'a' ) return smallAns;   //' ' - eta char aa use hoye ar r ekhane
                       // " " eta use hoye na krn ota char ta k string a convert kore deye eta char ee thkte deye
      else {
         return currChar + smallAns;
      }
   }

   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println(removeA(s, 0)); // tc -> O(n^2)     n ( nof of call) * n (concatenation)(time taken in 1 call)
       System.out.println(removeA2(s)); // tc -> O(n^2) n * 2n {substring+ concat n+n = 2n}
   }
}
//OUTPUT
//abhaafg
//bhfg
// why concatination is linear ?
//str= str1+ str2 hello+you (n+m)
