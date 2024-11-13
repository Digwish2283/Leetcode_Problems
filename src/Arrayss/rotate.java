package Arrayss;

public class rotate {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int n = arr.length;
       rot(arr, n);
    }
    public static void rot (int[] arr , int n){

        int[] temp = new int[n];

        for (int i = 1; i < n ; i++) {
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];

        for (int i = 0; i < temp.length ; i++) {
            System.out.print(temp[i]+ " ");
        }
    }

}
