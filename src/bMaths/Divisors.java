package bMaths;

public class Divisors {
    public static void main(String[] args) {
        int n = 10;
        int[] divisors = result(n);
    }
    public static int[] result(int n) {
        int[] divisors = new int[n];
        for (int i = 1; i <n; i++) {
            if (n % i == 0) {
                divisors = new int[]{i};
            }
        }
        return divisors;
    }
}
