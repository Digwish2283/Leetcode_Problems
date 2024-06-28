package Arrays;

public class reverseno {
    public static void main(String[] args) {
        int a = 1534236469;
        int result = rvrs(a);
        System.out.println(result);
    }

    private static int rvrs(int a) {
        int reversed = 0;
        while(a>0){
            int rem = a%10;
            reversed = reversed * 10 + rem;
            a = a/10;
        }
        return reversed;
    }
}
