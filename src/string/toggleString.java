package string;

public class toggleString {
    public static void main(String[] args) {
        String sb = "AyUsH BhoWmIcK";
        //StringBuilder str = new StringBuilder(sb);
        for (int i = 0; i < sb.length(); i++) {
            boolean flag = true; //captital
            char ch = sb.charAt(i);
            if (ch == ' ') {
                continue;
            }
             int ascii = (int)ch;
            if (ascii >97) {
                flag = false;
            }
            if (flag == true) {
                ascii +=32;
                char df = (char)ascii;
                sb= sb.substring(0, i)+ df + sb.substring(i+1); // AY + u + SH
            }else {
                ascii -=32;
                char df = (char)ascii;
                sb= sb.substring(0, i)+ df + sb.substring(i+1);
            }

        }
        System.out.println(sb);


    }
}
//aYuSh bHOwMiCk
