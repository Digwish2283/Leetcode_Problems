package OOPS;

import java.util.HashMap;
import java.util.HashSet;

public class Prob_3 {

    public static void useHashSet(int[] arr, int n){
        HashSet <Integer> h = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            h.add(arr[i]);
        }
        System.out.println(h);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5,6};
        int n = arr.length;
        useHashSet(arr,n);
    }
}
