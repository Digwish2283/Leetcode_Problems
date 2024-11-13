package Strings;

import java.util.Arrays;
import java.util.Locale;

public class AnagramString {
    public static void main(String[] args) {
        String s = "abnmd";
        String t = "nmdba";
        System.out.println(anagrm(s,t));
    }
    public static boolean anagrm(String s, String t){

        if (s.length()!=t.length()){
            return false;
        }
        else {
            char[] c1 = s.toLowerCase().toCharArray();
            char[] c2 = t.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }


}
