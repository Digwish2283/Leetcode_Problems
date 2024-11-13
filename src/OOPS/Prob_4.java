package OOPS;

public class Prob_4 {
    static void solve(int[] arr, int n){
        int[] temp = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];

        for (int i = 0; i <n ; i++) {
            System.out.print(temp[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        solve(arr,n);
    }
}