package Recursion;

import java.util.Scanner;

public class Prob_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desired no :");
        int n = sc.nextInt();
        int i = 1;
        print(n,i);
    }
    public static void print(int n , int i){
        System.out.println(i);
        if (n==i){
            return;
        }
        i++;
        print(n,i);
    }
}
