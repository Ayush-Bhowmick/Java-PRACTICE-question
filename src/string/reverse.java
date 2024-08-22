// reverse each of the sentence but not the sentence
package string;

public class reverse {
    public static void main(String[] args) {
         String str= "how are you buddy";
         String ans =" ";
         StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // jdi space na thske tahole char add kore dao stringbuilder a
                sb.append(ch);
            }else {
                sb.reverse(); // ebr jkhn space elo reverse koredii
                ans+= sb;// kore dewr por ota k stringbuilde er modhe addd kore dii
                ans+= " "; // r ekta space add kore di
                sb.delete(0,sb.length()); // or create new stringbuilder new StringBuilder()
                // r niye oii stringbuilder k delete ba notun builder toiri koremi
            }
        }
        sb.append(" "); // j hutu last word tar por space nei ota add hbe na taii ekta space add kora holo
        sb.reverse();// niye oii last word ta k reverse kora holo
        ans+=sb; // niyw add kore dewa holo
        System.out.println(sb);// niye oii ta jeta bki chilo ota reverse hoyeche check kora holo
        System.out.println(ans);// ebr ans ta mne puro reerse string k print kore dewa holo
    }
}
//output
// yddub
//         woh era uoy  yddub //dekho yddub er duto space ache ekta nai karon add korlm taiii
