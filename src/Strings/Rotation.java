package Strings;

public class Rotation {
    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        String s2 = "EFGABCD";
       rotate(s1,s2);
    }
    public static void rotate(String s1, String s2){

        if (s1.length()!=s2.length()){
            System.out.println("not a rotation");
        }
        else {

            String s3;
            s3 = s1 + s1;

            if (s3.contains(s2)){
                System.out.println("Yes "+s2+" is "+"rotation of "+s1);
            }
            else {
                System.out.println("error");
            }

        }
    }
}
