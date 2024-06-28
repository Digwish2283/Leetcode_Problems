public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        int nrow = n;

        for (int rows = 1; rows <= nrow ; rows++) {
            for (int cst = 0; cst <rows ; cst++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
