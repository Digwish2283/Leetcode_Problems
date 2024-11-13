package Arrayss;

public class Prob {
    static boolean isSort(int[] arr, int n){
        int i = 0;
        for (int j = 1; j < n ; j++) {
            if (arr[i]<arr[j]){
                i++;
            }else {
                return false;
            }
        }

    return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,4,5,6};
        int n = 6;
        System.out.println(isSort(arr,n));
    }
}
