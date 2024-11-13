package Recursion;

import java.util.Scanner;

public class Prob_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desired no of which you want factorial :");
        int n = sc.nextInt();
        int bhau = print(n);
        System.out.println(bhau);
    }
    public static int print(int n){
        int ans = 1;
        for (int i = 1; i<=n  ; i++) {
             ans = ans*i;
        }
        return ans;
    }
}
