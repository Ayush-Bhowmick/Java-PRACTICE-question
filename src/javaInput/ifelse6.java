package javaInput;
import java.util.Scanner;
public class ifelse6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter l");
         int L=sc.nextInt();
        System.out.println("enter b");
          int B=sc.nextInt();
          int area=L*B;
          int P=2*(L+B);
          if(area>P){
              System.out.println("area jindabbad");
              System.out.println(area);
          }else {
              System.out.println("p jindabaad");
              System.out.println(P);
          }
    }
}
