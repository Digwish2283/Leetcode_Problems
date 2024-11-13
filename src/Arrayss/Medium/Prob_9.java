package Arrayss.Medium;

public class Prob_9 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4};
        int k = 6;
        int ans = subsr(a,k);
        System.out.println(ans);
    }

    public static int subsr(int[] a , int k){
        long sum = 0;
        int len = 0;
        int n = a.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                sum+=a[i]+a[j];
                if (a[i]+a[j]==k){
                   len = Math.max(len,i+j);
                }
            }
        }

        return len;
    }
}
