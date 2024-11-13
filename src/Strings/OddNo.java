package Strings;

public class OddNo {
    public static void main(String[] args) {
        String num = "632468";
        System.out.println("The largest odd no in the given string is :"+largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
            for (int i = num.length() - 1; i >= 0; i--)
                if (num.charAt(i) % 2 == 1) {
                    return num.substring(0, i + 1);
                }
            return " sorry bro ";
    }
}
