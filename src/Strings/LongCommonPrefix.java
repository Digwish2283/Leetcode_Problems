package Strings;

import java.util.Arrays;

public class  LongCommonPrefix {
    public static void main(String[] args) {
        String[] v = {"geek","geeker"};
        System.out.println(longestCommonPrefix(v));
    }

    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];

        for (int i = 0; i <Math.min(first.length(),last.length()) ; i++) {
            if (first.charAt(i)!=last.charAt(i)){
                ans.toString();
            }
            ans.append(first.charAt(i));
        }
        System.out.println(ans);
        return "0";
    }
}


