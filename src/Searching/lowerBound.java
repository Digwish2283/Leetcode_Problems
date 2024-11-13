package Searching;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int x = 4;
        System.out.println(Bhai(arr,x));
    }

    public static int Bhai(int[] arr, int x ) {
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]>x ){
                return i;
            }
        }
        return 9;
    }
}
