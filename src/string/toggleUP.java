package string;
import java.util.*;
public class toggleUP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0;i<str.length();i++){ // puro string ta k iterate korchiii
            // capital letter - 65 90
            boolean flag=true; // true mne capital
            char ch = str.charAt(i); // fetch korlm kon ch ta ache
            int ascii = (int)ch; //  typecast the ascii value mne oi char er aschiii val ta ber korlm
            if(ascii> 97){ // small letter check hoche
                flag = false;// small letter
            }
            if (flag==true){ // captital
                ascii +=32;
                char dh=(char)ascii; // small letter hoye glo
                str.setCharAt(i,dh); //replace kore dilm A -> a
            }else {
                ascii -=32; // capital letter er ascii value te pouche glm
                char dh = (char)ascii; // otr char ber kore nilm typescript kore
                str.setCharAt(i,dh);// set kore dilm string
            }
        }
        System.out.println(str);
    }
}
//output
//pHYsiCs
//pHYsiCs
//PhySIcS
