package Searching;

public class Prob_1 {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(answer(n));
    }
    public static int answer(int n){
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (i*i<=28){
                ans = i;
            }else {
                break;
            }
        }

        return ans;
    }
}
