import java.util.*;

public class isFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        if (num >= 0 && num <= 3 || num == 5) {
            System.out.println("YES");
        } else {
            boolean flag = false;

            for (int i = 1; i <= num - 2; i++) {
                int fibonacci = a + b;
                a = b;
                b = fibonacci;

                if (fibonacci == num) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.println("NO");
            }
        }

    }
}