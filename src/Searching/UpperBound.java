package Searching;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        int x = 5;
        System.out.println(opt(arr,x));
    }
    public static int opt (int[] arr,int x){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]>x){
                return i;
            }
        }
        return 0;
    }

}
