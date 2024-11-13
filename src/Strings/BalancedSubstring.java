package Strings;

public class BalancedSubstring {
    public static int balancedStringCount(String s) {
        int count = 0;  // To count the number of balanced substrings
        int balance = 0;  // Keeps track of the balance between 'R' and 'L'

        // Traverse through the string
        for (char c : s.toCharArray()) {
            // Increment or decrement balance based on character
            if (c == 'R') {
                balance++;
            } else if (c == 'L') {
                balance--;
            }

            // Whenever balance is 0, we have a balanced substring
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "RRLLRL";
        System.out.println("Number of balanced substrings: " + balancedStringCount(s));
    }
}
