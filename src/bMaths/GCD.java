package bMaths;

public class GCD
{
    public static void main(String[] args) {
        int n1 = 48;
        int n2 = 72;

        int Final = Fc(n1,n2);
        System.out.println(Final);
    }

    public static int Fc(int n1,int n2){
        int GCd = 0;
        for (int i = 1; i <Math.min(n1 , n2) ; i++) {
            if (n1%i == 0 && n2%i==0){
                GCd = i;
            }
        }
        return GCd;
    }
}
