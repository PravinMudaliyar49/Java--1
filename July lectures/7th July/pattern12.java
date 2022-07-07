import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0, b = 1, c = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                c = a + b;
                System.out.print(b + "\t");

                a = b;
                b = c;
            }

            System.out.println();
        }

        sc.close();
    }
}
