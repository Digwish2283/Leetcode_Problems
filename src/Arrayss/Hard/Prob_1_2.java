package Arrayss.Hard;

public class Prob_1_2 {
    public static void main(String[] args) {
        int n = 5;
        pr(n);
    }
    public static void pr(int n){
        int ans = 1;
        System.out.print(ans+" ");

        for (int i =1; i <n ; i++) {
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans+" ");
        }
    }
}
