public class Pattern3 {
    public static void main(String[] args) {
        int n =5; //odd
        int trows = n;

        int star= 1;

        for (int row = 1; row <=trows ; row++) {
            if (row<=n/2) {
                for (int cst = 1; cst <= star; cst++) {
                    System.out.print(cst); //"* "
                }
                System.out.println();
                star++;
            }
            else {
                for (int cst = 1; cst <= star ; cst++) {
                    System.out.print(cst); //"* "
                }
                System.out.println();
                star--;
            }
        }
    }
}
