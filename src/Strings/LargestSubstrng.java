package Strings;

public class LargestSubstrng {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(substringCount(s));
    }

    public static int substringCount(String s){
        int count = 0;
        char key = s.charAt(0);

        for (int i = 1; i <s.length() ; i++) {
            if (s.length()==1){return -1;}
            if (s.charAt(i)==key){
                count = i-1;
                break;
            } else{
                count = -1;
            }
        }
        return count;
    }

}
