package Recursion;

public class sumDigit {

    static int sumOfDigit(int n){

        //base case
        if(n>= 0 && n <= 9){
            return n;
        }

        // recursive work

        int smallAns = sumOfDigit(n/10);  // 12345/10 == 1234

        //self work

        return smallAns + n%10;           //
    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
        System.out.println(sumOfDigit(1234567));
    }
}
