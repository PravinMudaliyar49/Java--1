public class coverup {
    public static void main(String[] args) {
        int n = 36;

        for (int divisors = 1; divisors <= n; divisors++) {
            int ans = n % divisors;
            if (ans == 0) {
                System.out.println(divisors);
            }
        }

        System.out.println(n);

    }
}