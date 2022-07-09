public class reverseNum {
    public static void main(String[] args) {
        int num = 12345;     

        int reverse = 0;
        int sum = 0;

        while (num != 0) {
            int lastDig = num % 10;

            reverse = reverse * 10 + lastDig;
            sum = sum + lastDig;

            num = num / 10;
        }

        System.out.println(reverse);    // 54321
        System.out.println(sum);        // 15

    }
}
