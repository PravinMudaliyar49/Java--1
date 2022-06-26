public class primeInRange {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30;

        for (int n = n1; n <= n2; n++) {

            int countOfFactor = 0;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    countOfFactor++;
                }
            }

            if (countOfFactor == 0) {
                System.out.println(n);
            }

        }
    }
}
