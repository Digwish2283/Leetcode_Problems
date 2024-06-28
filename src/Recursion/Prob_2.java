package Recursion;

import java.util.Scanner;

public class Prob_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        print(n,i);
    }
    public static void print(int n, int i){

        if (i==n){
            return;
        }

        System.out.println("My name is Digvijay !!!");
        i++;
        print(n,i);
    }
}
