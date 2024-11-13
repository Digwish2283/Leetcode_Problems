package Hash;

import java.util.Scanner;
class Prob_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        System.out.println("Give desired input");
        s = sc.next();

        //precompute:
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q;
        System.out.println("input no of elements you want to check :");
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c]);
        }
    }
}
