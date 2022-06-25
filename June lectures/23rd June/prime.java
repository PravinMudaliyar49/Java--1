import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("Not a prime neither a composite");
                continue;
            }

            int countOfFactors = 0;

            for (int divisor = 1; divisor * divisor <= num; divisor++) {
                int ans = num % divisor;

                if (ans == 0) {
                    countOfFactors++;
                }
            }

            if (countOfFactors == 2) {
                System.out.println("Is a prime");
            } else {
                System.out.println("Not a prime");
            }

        }

    }
}
