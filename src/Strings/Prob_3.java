package Strings;

public class Prob_3 {
    public static void main(String[] args) {
        subStrings("code");
    }
    public static void subStrings(String str){

        for (int si = 0; si <str.length() ; si++) {
            for (int ei = si+1; ei <=str.length() ; ei++) {
                System.out.print(str.substring(si , ei)+",");
            }
            System.out.println();
        }
    }

}
