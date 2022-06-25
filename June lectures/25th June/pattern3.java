import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = n; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}