public class pattern5 {
    public static void main(String[] args) {
        int  n =5;
        int trow = n;

        for (int frow = 1; frow <=n*2-1 ; frow++) {
            System.out.print("* ");
        }
        System.out.println();
        int rows = n-1;
        int star = n-1;
        int spaces = 1;
        for (int roww = 1; roww <= rows; roww++) {


            for (int cst = 1; cst <= star; cst++) {
                System.out.print("* ");
            }
            //spaces
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print("  ");
            }
            //star
            for (int cst = 1; cst <= star; cst++) {
                System.out.print("* ");
            }
            //prep next line
            System.out.println();
            star--;
            spaces += 2;
        }
    }
}
