package Searching;

public class Prob_2Op {
    public static void main(String[] args) {
        int n = 3 , m = 8;
        int answer = num(n,m);
        System.out.println("Answer is :"+answer);
    }

    public static int num(int n, int m){

        int low = 1 , high = m;
        int ans = 1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int midN = nthroot(mid,n,m);

            if (midN == 1){
                return mid;
            } else if (midN==2) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return 500;
    }

    public static int nthroot(int mid, int n, int m){
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans = ans * mid;
            if (ans>m){
                return 2;
            }
        }
        if (ans==m){
            return 1;
        }
         return 0;
    }
}
