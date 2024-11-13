package Searching;

public class Prob_1_optimal {
    public static void main(String[] args) {
        int n = 35;
        System.out.println("The ans is :"+so(n));
    }
    public static int so(int n){

        int low = 1, high = n;
        int ans = -1;

        while(low<=high) {
            int mid = (low + high)/2;

            if (mid*mid>=n){
                high = mid -1;
            }
            if (mid*mid<=n){
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
}
