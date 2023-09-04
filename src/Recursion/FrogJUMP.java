package Recursion;

public class FrogJUMP {
    static  int best( int[] arr, int n, int idx){
        if (idx == n-1) return 0;  // going to the end of the array
        int opt1= best(arr,n,idx+1) + Math.abs(arr[idx+1] - arr[idx]);  // 1 bar jump kore value gulo add hoye callstack 1
                                                                             // aa asbe then opt2 er ans
                                                                             // er jnne wait korbe then decide hbe k chotyo then j
                                                                             // choto oo index 0 oor value uur sathe addd hbe


        if (idx == n-2) return opt1;  //jkhn odd value index aa chole jbe
                                      // jmn 3 te index r 2 te dariye tokhn toh r double jump hbe na tokhn opt 1 return kore debe


        int opt2= best(arr,n,idx+2) + Math.abs(arr[idx+2] - arr[idx]);
                                                      // opt1 er jkhn nijr aDDition complete kore
                                                        // callstack 1
                                                         // aa wait korbe tokhn tui nijr value niye okhane daiye thkbii

        return Math.min(opt1,opt2); // dujon er modhe sobche kom cost a k travel korche ota define korbe
    }

    public static void main(String[] args) {
         int[] arr = {10, 20, 30, 40};
        System.out.println(best(arr, arr.length, 0));
    }
}
//30

//EXPLANATION

// gey toh call stack aa recursion hbe jekhane arr n idx initially 0 hbe
//line 4 aa ekta call hbe jetr jne idx= 1 pass r ekhn oii method call er wait hbr ebr
// eta true hbe na so amra abr wait korbo abr true hbe na best erjnnne abr call hbe so
// 3 asbe so rii prog er main ki cost koto hbe r 3  theke  3 te gele value toh 0 ee hbe
//


