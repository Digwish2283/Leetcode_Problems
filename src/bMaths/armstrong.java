package bMaths;

public class armstrong {
    public static void main(String[] args) {
        int n = 407;
        int result = Chalo(n);
        if (n==result) {
            System.out.println(n + " is an armstrong number");
        }else {
            System.out.println(n + " is not an armstrong");
        }
    }

    public static int Chalo(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum = sum + num * num * num;
            n = n / 10;
        }
        return sum;
    }
}
