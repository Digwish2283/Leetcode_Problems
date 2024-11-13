package Strings;

public class Prob_2 {
    public static void main(String[] args) {
        System.out.println(replaceAsciiFunc("aBcDfg"));
    }
    public static String replaceAsciiFunc(String str){

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <sb.length() ; i++) {

            char ch = sb.charAt(i);

            if (i % 2 ==0){
                ch = (char) (ch+1);//aBcDfg  //Type casting which basically makes ch return ascii value (a = 97+1=98 = b) same for others
                sb.setCharAt(i , ch);
            }
            else {
                ch = (char) (ch-1);
                sb.setCharAt(i , ch);
            }
        }


        return sb.toString();
    }
}
