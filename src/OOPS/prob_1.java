package OOPS;

public class prob_1 {

    public static boolean twosum(int n, int[] arr, int target){
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if (arr[i]+arr[j] == target){
                    if (i == j){
                        j++;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int n = arr.length;
        int target = 15;
        System.out.println(twosum(n,arr,target));
    }
}
