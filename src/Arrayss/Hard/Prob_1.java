package Arrayss.Hard;

public class Prob_1 {
    public static void main(String[] args) {
        int n = 5 , r = 3;
        int ans = NcR(n-1,r-1);
        System.out.println("Answer is :"+ans);
    }
    public static int NcR(int n , int r){
        int res = 1;

        for (int i = 0; i < r; i++) {
            res *= (n-i);
            res = res/(i+1);
        }

        return res;
    }
}
