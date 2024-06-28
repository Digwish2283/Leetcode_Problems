package Arrays;

import java.util.Scanner;

public class bkcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Welcome "+name);

        System.out.println("Can you guess the sqr of a no 9");
        int ans = sc.nextInt();
        if (ans == 81){
            System.out.println("You guessed it right");
        }else {
            System.out.println("No !!!!! you failed");
        }
        System.out.println("Can you guess the sqr root of a 9 now????");
        int sqr_ans = sc.nextInt();
        if (sqr_ans == 3){
            System.out.println("You guessed it right");
        }else {
            System.out.println("No !!!!! you failed");
        }

    }
}
