package Arrays;

public class even {
    public static void main(String[] args) {
        int n = 1240;
        int result = evenDiv(n);
        System.out.println(result);
    }

    private static int evenDiv(int n) {
        int num = n;
        int rem;
        int count = 0;

        while (num > 0) {
            rem = num % 10;
            if (rem != 0 && n % rem == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
