import java.util.*;

public class greatestAmongst6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();

        int ans = 0;

        if (n1 > ans) {
            ans = n1;
        }

        if (n2 > ans) {
            ans = n2;
        }

        if (n3 > ans) {
            ans = n3;
        }

        if (n4 > ans) {
            ans = n4;
        }

        if (n5 > ans) {
            ans = n5;
        }

        if (n6 > ans) {
            ans = n6;
        }

        System.out.println(ans);
    }
}