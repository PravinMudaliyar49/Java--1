public class nxnPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");

            for (int j = 2; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
