package bMaths;

public class palindrome {
    public static void main(String[] args) {
        int a = 123321;
        int original = a;
        int ans = 0;

        while(a > 0) {
            int remainder = a % 10;
            ans = ans * 10 + remainder;
            a = a / 10;
        }
        if (original == ans) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
