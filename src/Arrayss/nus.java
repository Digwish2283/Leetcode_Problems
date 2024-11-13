package Arrayss;

import java.util.Scanner;

public class nus {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,4,5,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the query: ");
        int query = sc.nextInt();
        int count = 0;
        sort(arr,query,count);
    }

    private static void sort(int[] arr, int query, int count){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==query) count++;
        }
        System.out.println(count);
    }
}
