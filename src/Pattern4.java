public class Pattern4 {
    public static void main(String[] args) {
        int n = 7;
        int trows = n;

        int spaces = n/2;
        int star = 1;

        for (int row = 1; row <=trows ; row++) {
            for (int csp = 1; csp <=spaces ; csp++) {
                System.out.print("  ");
            }
            for (int cst = 1; cst <= star ; cst++) {
                System.out.print("* ");
            }
            System.out.println();
            if(row<=n/2){
                spaces--;
                star+=2;
            }else{
                spaces++;
                star-=2;
            }
        }
    }
}
