public class greatestDigit {
    public static void main(String[] args) {
        int n = 10238;

        int ans = 0;

        while (n != 0) {
            int lastDig = n % 10;

            if (lastDig > ans) {
                ans = lastDig;
            }

            n = n / 10;
        }

        System.out.println(ans);

    }
}
