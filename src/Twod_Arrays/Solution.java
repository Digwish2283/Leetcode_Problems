package Twod_Arrays;

import java.util.Scanner;

public class Solution {
    private static final String[] BELOW_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    // Method to convert number into words
    public static String numToWords(int num) {
        if (num == 0) return "Zero";
        int i = 0;
        String words = "";

        // Break the number into parts of 3 digits (thousands, millions, billions, etc.)
        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }
        return words.trim();
    }

    // Helper method to convert a 3-digit number into words
    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return BELOW_20[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + BELOW_20[num % 10] + " ";
        } else {
            return BELOW_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        int num1 = sc.nextInt();

        // Output the word representation of the number
        System.out.println("words = " + numToWords(num1));
    }
}
