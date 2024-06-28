public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int trows = n;
        int spaces = n - 2;
        int star = 1;

        for (int row = 1; row < trows; row++) {

            if (row == n / 2) {
                for (int cst = 1; cst < n; cst++) {
                    System.out.print("* ");
                }

                //star
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
                System.out.println();
                if (row < n / 2) {
                    star++;
                    spaces -= 2;
                } else {
                    star--;
                    spaces += 2;
                }
            }

        }
    }
}

