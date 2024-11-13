package Arrayss.Medium;

import java.util.Arrays;

public class Prob_1_1 {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int key = 7;
        System.out.println(sortt(arr,key));
    }
    public static String sortt(int[] arr,int key){
        int n = arr.length;
        Arrays.sort(arr);
        int right = 0;
        int left = n-1;
        for (int i = 0; i <n ; i++) {
            if (arr[right]+arr[left] > key ) left--;

            else if (arr[right]+arr[left] < key ) right++;

            else if (arr[right]+arr[left]==key){
                System.out.println(right +","+ left);
            }
        }

        return "Fuck";

    }
}
