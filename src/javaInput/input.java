package javaInput;
import java.util.Scanner; //input dewr time lagiye dibi
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER the Radius:- ");
        int radius;//dabba bana diya
        radius = sc.nextInt();//same input er time chupchap lagiye dibi , user ne value dilo
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println("the area is : "+area);
    }
}
