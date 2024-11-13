package OOPS;

import java.util.Scanner;

public class Prob2 {

    static void isSorted(int[] arr, int n){
        boolean ans = false;
        for ( int i = 1; i <n ; i++) {
            if (arr[i-1]<=arr[i]){
                ans = true;
            }else {
                ans = false;
                break;
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+" ");
        }

        isSorted(arr,n);

    }
}
