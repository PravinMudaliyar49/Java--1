import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stars = n;
        int spaces = 0;

        for (int i = 1; i <= n; i++) {
            // System.out.print(spaces + " " + stars);

            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*\t");
            }

            spaces++;
            stars--;

            System.out.println();
        }

    }
}
