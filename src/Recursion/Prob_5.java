package Recursion;

import java.util.Scanner;

public class Prob_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial no :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        print(n,sum,i);
    }
    public static void print(int n , int sum , int i){
        sum += i;
        System.out.println(sum);
        if (i==n){
            return;
        }
        i++;
        print(n,sum,i);
    }
}
