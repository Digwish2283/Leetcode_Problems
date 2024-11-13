package Searching;

import java.util.*;

public class Search_insert {

    public static ArrayList<Integer> searchInsert(int [] arr, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length; // size of the array
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] <= x) {
                ans.add(arr[mid]);
                //look for smaller index on the left
                low = mid + 1;
            }
            else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        System.out.println("The index is: ");
    }
}