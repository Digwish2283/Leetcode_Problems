package Hash;

import java.util.Scanner;
class Prob_2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,3,2,1,3,5,4,2};


        //precompute:
        int[] hash = new int[256];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        int q;
        System.out.println("input no of elements you want to check :");
        q = sc.nextInt();
        while (q-- > 0) {
            int c;
//            c = sc.next().int[0];
            // fetch:
//            System.out.println(hash[c]);
        }
    }
}

