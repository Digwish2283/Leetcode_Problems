package Arrayss.Medium;

public class Prob_8 {
    public static void main(String[] args) {
        int[] a ={3, 8, 5, 7, 6};
        int ans = counter(a);
        System.out.println(ans);
    }
    public static boolean linearSearch(int[]a,int num){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int counter(int[]a){

        int longest= 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;

            while (linearSearch(a,x+1)==true){
                cnt+=1;
                x+=1;
            }
            longest = Math.max(longest,cnt);
        }

        return longest;
    }
}
