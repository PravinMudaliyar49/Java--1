import java.util.*;

public class for_for_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        boolean flag = false;

        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ==> ");

            for (int j = 1; j <= n2; j++) {
                System.out.print(j + " ");

                if (i == n3 && j == n4) {
                    flag = true;
                    break;
                }
            }

            if (flag == true) {
                break;
            }

            System.out.println();
        }

    }
}