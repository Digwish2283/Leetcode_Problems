package Strings;

public class Prob_1 {
    public static void main(String[] args) {
        String s1 = "AbbA";
        System.out.println(isPalindrome(s1));
    }
    public static boolean isPalindrome(String s1){

        int right = s1.length()-1;
        int left = 0;

        while (right>left){
            if (s1.charAt(left)==s1.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }

        }
        return true;
    }
}
