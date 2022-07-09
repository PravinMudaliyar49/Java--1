import java.util.*;

public class jumpStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();

        // for (int i = 1; i <= n1; i++) {
        // if (i == n2) {
        // break;
        // }

        // System.out.println(i);
        // }

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // for (int i = n1; i <= n2; i++) {
        // if (i != n3) {
        // System.out.println(i);
        // }
        // }

        for (int i = n1; i <= n2; i++) {
            if (i == n3) {
                break;
            }

            System.out.println(i);
        }

    }
}
