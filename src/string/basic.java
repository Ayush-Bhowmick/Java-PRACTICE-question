package string;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //char[] arr = new char[10];
//        String str = "College";
//        System.out.println(str);
//        String s = sc.next();
//        String s1 = sc.nextLine();
//        System.out.println(s);
//        System.out.println(s1);
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("e"));
        System.out.println(str.compareTo("ayush"));
        System.out.println(str.contains("h"));
        System.out.println(str.endsWith("o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat("owl"));
    }
}
//output
//5
//o
//1
//7
//true
//true
//hello
//HELLO
//helloowl
//
//Process finished with exit code 0
