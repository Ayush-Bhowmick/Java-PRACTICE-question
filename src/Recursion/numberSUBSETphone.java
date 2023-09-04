package Recursion;

public class numberSUBSETphone {

    static void combination(String digit, String[] kp, String result){

        if (digit.length() ==0){
            System.out.print(result+" "); //at the end print result with space b/w
            return;
        }
        int currNum = digit.charAt(0) - '0';//2, //converting character into integer by subtracting char 0 (one of the ways)
        String currChoices = kp[currNum]; //"abc"

        for (int i = 0; i < currChoices.length(); i++) { //to access all abc
            combination(digit.substring(1), kp,result + currChoices.charAt(i));
            // result + currChoices = a+d/a+e/a+f, b+d/b+e/b+f, c+d/c+e/c+f
        }


    }

    public static void main(String[] args) {
        String digit="2673";
        //kp[7]=pqrs;
        String[] kp={" ", " ", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuvw", "xyz"};  //kp= keypad
        //            0    1     2     3      4      5      6       7       8      9
        combination(digit, kp, "");
    }
}
//output-

//23
//ad ae af bd be bf cd ce cf

//263
//amd ame amf and ane anf aod aoe aof bmd bme bmf bnd bne bnf bod boe bof cmd cme cmf cnd cne cnf cod coe cof

//2673
//ampd ampe ampf amqd amqe amqf amrd amre amrf amsd amse amsf anpd anpe anpf anqd anqe anqf anrd anre anrf ansd anse
//ansf aopd aope aopf aoqd aoqe aoqf aord aore aorf aosd aose aosf bmpd bmpe bmpf bmqd bmqe bmqf bmrd bmre bmrf bmsd
//bmse bmsf bnpd bnpe bnpf bnqd bnqe bnqf bnrd bnre bnrf bnsd bnse bnsf bopd bope bopf boqd boqe boqf bord bore borf
//bosd bose bosf cmpd cmpe cmpf cmqd cmqe cmqf cmrd cmre cmrf cmsd cmse cmsf cnpd cnpe cnpf cnqd cnqe cnqf cnrd cnre
//cnrf cnsd cnse cnsf copd cope copf coqd coqe coqf cord core corf cosd cose cosf
