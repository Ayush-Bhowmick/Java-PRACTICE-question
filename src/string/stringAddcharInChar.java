package string;

public class stringAddcharInChar {
    public static void main(String[] args) {
       String string = "abcd";//0 to 3
        for (int i = 0; i <3 ; i++) {
            for (int j = i+1; j <4 ; j++) {
                System.out.println(string.substring(i,j));
            }
        }

    }
}
