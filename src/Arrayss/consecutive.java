package Arrayss;

public class consecutive {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1,1};
        int n = arr.length;
        System.out.println(cons(arr,n));
    }
    public static int cons(int[] arr, int n){
        int max_count = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i <n ; i++) {
            if (arr[i]==1){
                count++;
            }
            if (count>max_count){
                max_count = count;
            }
            if (arr[i]!=1){
                count = 0;
            }
        }
        return max_count;
    }
}
