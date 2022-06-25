import java.util.Scanner;

public class primeOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Not a prime neither a composite");
                continue;
            }

            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                int rem = n % j;

                if (rem == 0) {
                    System.out.println("Not a prime");
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println("Prime");
            }

        }
    }
}