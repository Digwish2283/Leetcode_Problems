package Arrayss;

import java.util.Arrays;

public class Prob_2 {
    static void scnd(int[] arr){
        Arrays.sort(arr);
        int Second_last = arr[arr.length-2];
        System.out.println("The second last element is :"+Second_last);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,35,2,6,8};
        scnd(arr);
    }
}
