package Arrays;

public class Tp {
    public static void main(String[] args) {
        int n = 2134545;
        int count = 0;

        while (n > 0) {
            count = count + 1;

            n = n / 10;

        }
        System.out.println("The count of the no is : "+count);
    }
}
