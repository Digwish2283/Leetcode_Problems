public class Pattern2 {
    public static void main(String[] args) {
        int n = 4;
        int trows = n;

        int spaces = n-1;
        int star = 1;

        for (int rows = 1; rows <= trows; rows++) {
            //spaces
            for (int csp = 1; csp <=spaces ; csp++) {
                System.out.print("  ");
            }
            //printing stars
            for (int cst = 1; cst <=star ; cst++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            star += 1;
        }
    }
}
